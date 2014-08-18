package vocab

import tool.Random._

abstract class Vocab {
  val vocab = set
  
  def set: Seq[() => String]
  
  def get: String =
    vocab(rand.nextInt(vocab.length))()


  class RichSeqString(s: Seq[String]) {
    def toVocab: Seq[() => String] = s.map(i => () => i)
  }
  implicit def richSeqString(s: Seq[String]) = new RichSeqString(s)
}