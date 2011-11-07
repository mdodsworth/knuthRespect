package knuthrespect.util

import org.specs2.mutable._

 class RandomNumberExampleSpec extends Specification {

   "The Random Number String Example" should {
     "return an integer between 0-7" in {
       val randomNumber = new RandomNumberExample
       randomNumber.nextRandomUpToSeven must beGreaterThanOrEqualTo(0) and lessThanOrEqualTo(7)
     }
   }
 }