package Week4

trait Expr
case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr
case class Prod(e1: Expr, e2: Expr) extends Expr
case class Var(x: String) extends Expr

object exprs extends App {
  def show(e: Expr, top: Boolean = true): String = e match {
    case Number(x) => x.toString
    case Sum(e1, e2) => if (top) show(e1, false) + " + " + show(e2, false) else "(" + show(e1, false) + " + " + show(e2, false) + ")"
    case Prod(e1, e2) => show(e1, false) + " * " + show(e2, false)
    case Var(x) => x
  }
  println(show(Sum(Number(3),  Number(23))))
  println(show(Sum(Prod(Number(3), Var("y")), Var("x"))))
  println(show(Prod(Sum(Number(3), Var("y")), Var("x"))))
}