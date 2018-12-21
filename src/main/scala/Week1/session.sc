object session {
  def abs(x: Double): Double = if (x > 0) x else -x

  def sqrtIter(guess: Double, x: Double): Double = {
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)
  }

  def isGoodEnough(guess: Double, x: Double): Boolean =
    abs(guess * guess - x)/x <= 1e-7

  def improve(guess: Double, x: Double): Double = {
    (guess + x / guess) / 2
  }

  def sqrt(x: Double): Double = sqrtIter(x/2, x)
}

session.sqrt(.001)
session.sqrt(.1e-20)
session.sqrt(1.0e20)
session.sqrt(1.0e50)