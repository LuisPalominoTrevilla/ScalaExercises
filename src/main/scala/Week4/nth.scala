package Week4
import Week4.{List, Cons, Nil}

object nth extends App {
  def nth[T](i: Int, list: List[T]): T =
    if (list.isEmpty) throw new IndexOutOfBoundsException("Empty list")
    else if (i == 0) list.head
    else nth(i-1, list.tail)

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))

  println(nth(0, list))
  println(nth(-1, list))
  println(nth(4, list))
}
