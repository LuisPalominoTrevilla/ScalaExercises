package Week3

object Hello {
  val t1 =  new Rational(1,2)
  def main(args: Array[String]) =
    println(t1)
    error("test")
  def error(s: String): Nothing = throw new Error(s)
}