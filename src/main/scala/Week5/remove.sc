def removeAt(n: Int, xs: List[Int]): List[Int] = (xs take n) ::: (xs drop n + 1)

def flatten(xs: List[Any]): List[Any] = if (xs.isEmpty) Nil else xs.head match {
  case p: Int => p :: flatten(xs.tail)
  case l: List[Any] => l ::: flatten(xs.tail)
}

val lista = List(1,2,3)
val l2 = removeAt(1, lista)

val l3 = List(List(1,2),3,List(4),5)
val lap = flatten(l3)