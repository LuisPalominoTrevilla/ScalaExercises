def sum1(xs: List[Int]): Int = 0 :: xs reduceLeft (_ + _)
def prod1(xs: List[Int]): Int = 1 :: xs reduceLeft (_ * _)
def sum2(xs: List[Int]): Int = (xs foldLeft  0)(_ + _)
def prod2(xs: List[Int]): Int = (xs foldLeft  0)(_ * _)

sum1(List(1,2,5))
prod1(List(1,2,3,4))
sum2(List())
prod2(List())

def mapFun[T, U](xs: List[T], f: T => U): List[U] =
  (xs foldRight List[U]())((x: T, y: List[U]) => List(f(x)) ::: y)

def lengthFun[T](xs: List[T]): Int =
  (xs foldRight 0)((x: T, y: Int) => y+1)

lengthFun(List(1,7))
mapFun[Int, Int](List(1,2,3), x => x * 2)

