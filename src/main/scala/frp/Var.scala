package frp

class Var[T](expr: => T) extends Signal[T](expr){
  override def update(expr: => T): Unit = super.update(expr)
}

object Var {
  def apply[T](expr: => T): Var[T] = new Var(expr)
}


