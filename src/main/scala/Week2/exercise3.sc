object exercise3 {
  def sum(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f)(a+1, b)
  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)
  def factorial(n: Int): Int = product(x=>x)(1,n)
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
}

exercise3.sum(x=>x)(1,4)
exercise3.product(x=>x*x)(1,3)
exercise3.factorial(5)
exercise3.mapReduce(x=>x*x, (x, y) => x*y, 1)(1,3 )