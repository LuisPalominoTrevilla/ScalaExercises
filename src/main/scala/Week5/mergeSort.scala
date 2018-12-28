package Week5

object mergeSort extends App {
  def msort(xs: List[Int]): List[Int] = {
    val n = xs.length/2
    if (n == 0) xs
    else {
      def merge(xs: List[Int], ys: List[Int]): List[Int] =
        (xs, ys) match {
          case (Nil, ys) => ys
          case (xs, Nil) => xs
          case (x :: xs1, y :: ys1) =>
            if (x < y) x :: merge(xs1, ys)
            else y :: merge(xs, ys1)
        }
      val (left, right) = xs splitAt n
      merge(msort(left), msort(right))
    }
  }

  val list = List(2,4,5,1,2,9,10,23,2,5,1,-1,0,234,-102,20,-23,123,2,5,67,490,12,-10)
  println(msort(list))
}
