package Week5
import math.Ordering

object mergeSort extends App {
  def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
    val n = xs.length/2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] =
        (xs, ys) match {
          case (Nil, ys) => ys
          case (xs, Nil) => xs
          case (x :: xs1, y :: ys1) =>
            if (ord.lt(x, y)) x :: merge(xs1, ys)
            else y :: merge(xs, ys1)
        }
      val (left, right) = xs splitAt n
      merge(msort(left), msort(right))
    }
  }

  val numbers = List(2,4,5,1,2,9,10,23,2,5,1,-1,0,234,-102,20,-23,123,2,5,67,490,12,-10)
  val fruits = List("apple", "pineapple", "orange", "banana")
  println(msort(numbers))
  println(msort(fruits))
}
