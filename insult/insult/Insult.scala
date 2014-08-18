package insult

object Insult {
  
  private def produce(items: Seq[SingleItem]) = {
    items.foldLeft("")(_ + _.getWord)
  }
  
  def fetch = produce(Sentence.get)
}