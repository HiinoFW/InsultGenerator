package contents

import random._
import insult._

abstract class Contents {
  val odds = set
  
  def set: Odds[Seq[ItemSet]]
	
	def get = odds.get
	
	def seq(items: ItemSet*) = items
}

object NounPhraseContents extends Contents {
  override def set = {
    OddBuilder
    .add(2, seq(Noun))
    .add(1, seq(AdjectivePhrase, Conjonction(" "), NounRight))
    .add(1, seq(NounLeft, Conjonction(" "), NounRight))
  }
}

object NounLeftContents extends Contents {
  override def set = {
    OddBuilder
    .add(2, seq(Noun))
    .add(1, seq(AdjectivePhrase, Conjonction(" "), Noun))
  }
}

object NounRightContents extends Contents {
  override def set = {
    OddBuilder
    .add(2, seq(Noun))
    .add(1, seq(Noun, Conjonction(" "), Noun))
  }
}

object NounContents extends Contents {
  override def set = {
    OddBuilder
    .add(1, seq(NounThing))
    .add(1, seq(NounActivity))
    .add(2, seq(NounThing, NounActivityGeneric))
  }
}

object AdjectivePhraseContents extends Contents {
  override def set = {
    OddBuilder
    .add(2, seq(AdjectiveStar))
    .add(1, seq(AdverbStar, Conjonction(" "), AdjectiveStar))
    .add(1, seq(AdjectiveStar, Conjonction(" "), AdjectiveStar))
  }
}

object AdverbStarContents extends Contents {
  override def set = {
    OddBuilder
    .add(1, seq(Adverb))
    .add(1, seq(NounThing, AdverbGeneric))
  }
}

object AdjectiveStarContents extends Contents {
  override def set = {
    OddBuilder
    .add(1, seq(Adjective))
    .add(1, seq(NounThing, AdjectiveGeneric))
  }
}

object SentenceContents extends Contents {
  override def set = {
    OddBuilder
    .add(8, seq(Conjonction("you "), NounPhrase))
    .add(1, seq(Participle, Conjonction(" "), NounPhrase))
    .add(1, seq(Participle, Conjonction(" "), NounPhrase, Conjonction(" coupled with a "), NounPhrase))
    .add(2, seq(NounPhrase, Preposition))
    // .add(1, seq(Special))
  }
}

/* object NounPhraseContents extends Contents {
  override def set = {
    OddBuilder
    .add(1, seq(NounStar))
    .add(0, seq(AdjectivePhrase, Conjonction(" "), NounRight))
    .add(0, seq(ParticipialPhrase, Conjonction(" "), NounRight))
    .add(0, seq(NounLeft, Conjonction(" "), NounRight))
    .add(0, seq(NounLeft, Preposition))
  }
}

object NounLeftContents extends Contents {
  override def set = {
    OddBuilder
    .add(1, seq(NounStar))
    .add(1, seq(AdjectivePhrase, Conjonction(" "), NounStar))
    .add(1, seq(ParticipialPhrase, Conjonction(" "), NounStar))
    .add(1, seq(NounLeft, Conjonction(" "), NounStar))
  }
}

object NounRightContents extends Contents {
  override def set = {
    OddBuilder
    .add(1, seq(NounStar))
    .add(1, seq(Noun, Preposition))
    .add(1, seq(NounStar, Conjonction(" "), NounRight))
  }
}

object NounStarContents extends Contents {
  override def set = {
    OddBuilder
    .add(0, seq(Noun))
    .add(1, seq(Prefix, Conjonction("-"), NounStar))
    .add(0, seq(NounThing, Conjonction("-"), SuffixNouns))
    .add(0, seq(NounThing, Noun))
  }
}

object NounContents extends Contents {
  override def set = {
    OddBuilder
    .add(1, seq(NounThing))
    .add(1, seq(NounActivity))
  }
}

object AdjectivePhraseContents extends Contents {
  override def set = {
    OddBuilder
    .add(1, seq(AdjectiveStar))
    .add(1, seq(AdverbStar, AdjectivePhrase))
    .add(1, seq(AdjectivePhrase, AdjectiveStar))
    .add(1, seq(AdjectiveStar, Conjonction(", "), AdjectivePhrase))
  }
}

object AdverbStarContents extends Contents {
  override def set = {
    OddBuilder
    .add(1, seq(Adverb))
    .add(1, seq(Prefix, AdverbStar))
    .add(1, seq(NounThing, Adverb))
  }
}

object AdjectiveStarContents extends Contents {
  override def set = {
    OddBuilder
    .add(1, seq(Adjective))
    .add(1, seq(Prefix, AdjectiveStar))
    .add(1, seq(Adjective, Suffix))
    .add(1, seq(NounThing, Adjective))
  }
}

object ParticipialPhraseContents extends Contents {
  override def set = {
    OddBuilder
    .add(1, seq(ParticipleStar))
    .add(1, seq(AdverbStar, ParticipialPhrase))
  }
}

object ParticipleStarContents extends Contents {
  override def set = {
    OddBuilder
    .add(1, seq(Participle))
    .add(1, seq(Prefix, ParticipleStar))
    .add(1, seq(Participle, Suffix))
    .add(1, seq(NounThing, Participle))
  }
}

object SentenceContents extends Contents {
  override def set = {
    OddBuilder
    .add(0, seq(Conjonction("you "), NounPhrase))
    .add(0, seq(NounPhrase))
    .add(8, seq(Special))
  }
} */