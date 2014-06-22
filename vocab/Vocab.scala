package vocab

import tool.Random

abstract class Vocab {
  val vocab = set
  
  def set: Seq[String]
  
  def get: String =
    vocab(Random.get.nextInt(vocab.length))
}