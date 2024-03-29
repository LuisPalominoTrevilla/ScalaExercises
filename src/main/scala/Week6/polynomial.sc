class Poly(terms0: Map[Int, Double]) {
  def this(bindings: (Int, Double)*) = this(bindings.toMap)
  val terms = terms0 withDefaultValue(0.0)
  def + (other: Poly): Poly = new Poly(terms ++ (other.terms map adjust))
  def adjust(term: (Int, Double)): (Int, Double) = {
    val (exp, coeff) = term
    exp -> (coeff + terms(exp))
  }
  def add (other: Poly): Poly =
    new Poly((other.terms foldLeft terms)(addTerm))

  def addTerm (terms: Map[Int, Double], term: (Int, Double)): Map[Int, Double] = {
    val (exp, coeff) = term
    terms + (exp -> (coeff + terms(exp)))
  }

  override def toString: String =
    (for ((exp, coeff) <- terms.toList.sorted.reverse) yield coeff + "x^" + exp) mkString " + "

}

val p1 = new Poly(0 -> 1, 1 -> 1, 2 -> 3)
val p2 = new Poly(0 -> 2, 2 -> 1)
p1 add p2
p1.terms(7)