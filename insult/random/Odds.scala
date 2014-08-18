package random

import tool.Random._

class Odds[T](itemset: Seq[T]) {
  val items = itemset
  
  def add(i: Int, item: T) =
    new Odds[T](items.padTo(items.length + i, item))
  
  def concat(oddset: Odds[T]) =
    oddset.items.foldLeft(new Odds[T](Seq()))(_.add(1, _))
  
  def get: T =
    items(rand.nextInt(items.length))
}

object OddBuilder {
  def add[T](i: Int, item: T) =
    new Odds(Seq.fill(i)(item))
}