package Week4

trait List[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def prepend[U >: T](elem: U): List[U] = new Cons(elem, this)
  override def toString: String = if (isEmpty) "" else head + ", " + tail
}

class Cons[T](val head: T, val tail: List[T]) extends  List[T] {
  def isEmpty: Boolean = false
}

object Nil extends List[Nothing] {
  def isEmpty: Boolean = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}

object List {
  // List(1, 2) = List.apply(1, 2)
  def apply[T](x1: T, x2: T): List[T] = new Cons[T](x1, new Cons[T](x2, Nil))
  def apply[T](x1: T): List[T] = new Cons[T](x1, Nil)
  def apply[T](): List[T] = Nil
}

object main extends App {
  println("Hello World")
  // For the next line, the apply method is applied
  println(List(1, 2))
}