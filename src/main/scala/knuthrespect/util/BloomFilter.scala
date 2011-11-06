package knuthrespect.util

import util.Random

class BloomFilter {
  def nextRandom = Random.nextInt(5)
  def nextRandomUpToSeven = nextRandom ^ nextRandom
}