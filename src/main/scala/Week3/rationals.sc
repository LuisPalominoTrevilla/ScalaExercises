class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must not be zero")

  // Define another constructor
  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  val numer = x / gcd(x, y)
  val denom = y / gcd(x, y)

  def < (other: Rational): Boolean = this.numer * other.denom < other.numer * this.denom

  def max(other: Rational): Rational = if (this < other) other else this

  def + (other: Rational): Rational =
    new Rational(
      numer*other.denom + other.numer*denom,
      denom*other.denom)

  def - (other: Rational): Rational = this + -other

  // Prefix operator
  def unary_- : Rational  = new Rational(-numer, denom)

  override def toString: String = numer + "/" + denom
}

val x = new Rational(1,3)
val y = new Rational(5,7)
val z = new Rational(3,2)
x + y - z
y + y
x < y
x max y
val w = new Rational(2)
-x