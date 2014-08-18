Insult Generator v1.0
===============

Insult generator written in Scala. Courtesy of Hiino. Beware of crudeness when using it (this is an insult generator).

Feel free to suggest some more vocabulary. I'm all up for short, funny, long, convoluted, mighty-sounding, rare words, lengthy hateful expressions, badly written slurs, and words-that-are-not-insults-but-sound-like-ones. Among other things.

Installation
------------

As they are now, the sources will not work or compile because they are lacking a Random object. This is because the generator is actually included in a more general project which contains more general-purpose utilities.

To make it work, just create a `Random.scala` file in a `tool` package, and write (or copy-paste) this inside:

```
package tool

object Random {
  private val rand = new scala.util.Random(System.currentTimeMillis)
  def get = rand
}
```

How To Get Burned
-----------------

Simply call the method `fetch` from the object `insult.Insult`, then go weep in a corner out of the humongous self-loathing the automaton just inflicted upon you. You're welcome.

Disclaimer
----------

I am in no way responsible for your wimpy ass hypothetically getting offended at any of the insults you might generate. If you know you get offended easily or if you are from Tumblr, then please consider not using an insult generator.

If you do use it nonetheless and it does offend you, please take a minute to reflect on the following question: would you get offended at the word you just read if you were reading it as an entry in a dictionary instead?

Contributing
------------

This repository was not made in order for people to work on it. You still can, and I will be glad if you do so, but do not expect this readme to explain how to operate. You will have to figure this out by yourself.

I'm sure you will manage. I have faith in you. Go champion.
