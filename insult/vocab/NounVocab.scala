package vocab

import tool.Random._

object NounVocab extends Vocab {
  override def set = Seq(
      "cosplayer"
      ,"wanker"
      ,"buffoon"
      ,"hillbilly"
      ,"visible fart"
      ,"toilet"
      ,"anacoluthon"
      ,"blister"
      ,"gleeking"
      ,"wolfaboo"
      ,"cumguzzler"
      ,"dumbass"
      ,"dumpass"
      ,"faggot"
      ,"bitch"
      ,"hyena"
      ,"crunch"
      ,"female"
      ,"catdog"
      ,"triple nigger"
      ,"insitive ham"
      ,"bloated doushe"
      ,"sperglord"
      ,"titsucker"
      ,"fool"
      ,"joke"
      ,"mongrel"
      ,"prostitution whore"
      ,"teriyaki stick"
      ,"hockey puck"
      ,"nincompoop"
      ,"vegemite"
      ,"inbred"
      ,"computer boy"
    ).toVocab ++ Seq(
    () => "[GENERIC INSULT #" + (rand nextInt 420 + 1) + "]"
    )
}

object NounGenericVocab extends Vocab {
  override def set = Seq(
      "warmer"
      ,"sniffer"
      ,"fondler"
      ,"licker"
      ,"destroyer"
      ,"filler"
      ,"jumper"
      ,"king"
      ,"bucket"
      ,"sucker"
      ,"berry"
      ," diddler"
      ,"fucker"
      ,"osaurus"
      ,"-o-matic"
      ,"pie"
      ,"sack"
      ,"nugget"
      ,"waffle"
      ," sandwich"
    ).toVocab
}