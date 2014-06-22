package insult

import random.Odds
import contents._

abstract class SeveralItems(contents: Contents) extends ItemSet {
  def get = contents.get.map(_.get).flatten
}

object NounPhrase extends SeveralItems(NounPhraseContents)
object NounLeft extends SeveralItems(NounLeftContents)
object NounRight extends SeveralItems(NounRightContents)
object Noun extends SeveralItems(NounContents)
object AdverbStar extends SeveralItems(AdverbStarContents)
object AdjectivePhrase extends SeveralItems(AdjectivePhraseContents)
object AdjectiveStar extends SeveralItems(AdjectiveStarContents)

object Sentence extends SeveralItems(SentenceContents)