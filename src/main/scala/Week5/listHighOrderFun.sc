def squareList(xs: List[Int], res: List[Int] = Nil): List[Int] =
  xs match {
    case Nil => res
    case y :: ys => squareList(ys, res ::: List(y*y))
  }

def squareListMap(xs: List[Int]): List[Int] =
  xs map(x => x*x)

val l1 = List(1,2,3,4)
squareList(l1)
squareListMap(l1)

val nums = List(2,4,1,-4,7,10)
val fruits = List("apple", "pineapple", "orange", "banana")
// Test higher order functions in List class
nums filter(x => x > 0)
fruits filter(x => x.contains('n'))
nums filterNot(x => x > 0)
nums partition(x => x > 0)

// Take the longest prefix of the list that satisfies the criterion
nums takeWhile(x => x > 0)
nums dropWhile(x => x > 0)
nums span(x => x > 0)

def pack[T](xs: List[T], acc: List[List[T]] = Nil): List[List[T]] = xs match {
  case Nil => acc.reverse
  case y :: ys =>
    val (left, right) = ys span(x => x == y)
    pack(right, (y :: left) :: acc)
}

def encode[T](xs: List[T]): List[(T, Int)] = {
  pack(xs) map(x => (x(0), x.length))
}

pack(List('a', 'a', 'a', 'b', 'c', 'c', 'a'))
encode(List('a', 'a', 'a', 'b', 'c', 'c', 'a'))