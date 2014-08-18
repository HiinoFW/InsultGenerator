package insult

import _root_.vocab._

abstract class SingleItem extends ItemSet {
  override def get = Seq(this)
  
  def getWord: String
}

abstract class SingleVocabItem(vocab: Vocab) extends SingleItem {
  override def getWord = vocab.get
}

object NounThing extends SingleVocabItem(NounGenericableVocab)
object NounActivity extends SingleVocabItem(NounVocab)
object NounActivityGeneric extends SingleVocabItem(NounGenericVocab)
object Adjective extends SingleVocabItem(AdjectiveVocab)
object AdjectiveGeneric extends SingleVocabItem(AdjectiveGenericVocab)
object Adverb extends SingleVocabItem(AdverbVocab)
object AdverbGeneric extends SingleVocabItem(AdverbGenericVocab)
object Preposition extends SingleVocabItem(PrepositionVocab)
object Participle extends SingleVocabItem(ParticipleVocab)
object Special extends SingleVocabItem(SpecialVocab)

case class Conjonction(str: String) extends SingleItem {
  override def getWord = str
}