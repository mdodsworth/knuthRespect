package knuthrespect.util

import util.Random

class RandomNumberExample {
  def nextRandom = Random.nextInt(5)
  def nextRandomUpToSeven = nextRandom ^ nextRandom
}