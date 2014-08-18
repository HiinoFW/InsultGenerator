package vocab

object AdverbVocab extends Vocab {
    override def set = Seq(
      "tremendously",
      "incredibly",
      "pointlessly",
      "unnaturally"
    ).toVocab
}

object AdverbGenericVocab extends Vocab {
    override def set = Seq(
      "fully"
    ).toVocab
}