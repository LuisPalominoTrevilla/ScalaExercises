def isPrime(n: Int): Boolean =
  (2 until n).map(x => n % x)forall(num => num != 0)

def combAlg1(n: Int) = {
  val xss = (1 until n) flatMap (i =>
    (1 until i) map (j => (i, j)))
  xss filter {case (x, y) => isPrime(x + y)}
}

def combAlg2(n: Int) = {
  for {
    i <- 1 until n
    j <- 1 until i
    if isPrime(j+i)
  } yield (i, j)
}

combAlg1(5)
combAlg2(5)

// For expression

case class Person(name: String, age: Int)

val persons = List(Person("Luis", 20), Person("Carlos", 15), Person("Rafa", 37))

for (p <- persons if p.age < 21) yield p.name

def scalarProduct(xs: List[Double], ys: List[Double]): Double =
  (for ((x, y) <- xs zip ys) yield x*y).sum