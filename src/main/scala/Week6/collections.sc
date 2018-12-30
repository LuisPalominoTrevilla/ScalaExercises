// Arrays and string use same operations of sequence class

val xs = Array(1,2,4,5)
xs map (_*2)
(xs foldLeft 0)((x: Int, y: Int) => x + y)

val s = "Hello World"
s filter (_.isUpper)


// Range sequence
val r: Range = 1 until 5  // Exclusive
val l: Range = 1 to 5 // Inclusive
1 to 10 by 3
6 to 1 by -2

s exists (c => c.isUpper)
s forall (c => c.isUpper)
println("HI")
val pairs = List(1,2,3) zip s
pairs.unzip

val la = List('a', 'b', 'a')
la.span(_== 'a')

s flatMap(c => List('.', c))

xs.sum

xs.max

// Combination

(1 to 5) flatMap (x => (1 to 3) map (y => (x, y)))

def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
  (xs zip ys).map (xy => xy._1 * xy._2).sum

def scalarProductPatternMatch(xs: Vector[Double], ys: Vector[Double]): Double =
  (xs zip ys).map{ case (x, y) => x * y}.sum

// { case p1 => e1 ... case p2 => e2 } is equivalent to:
// x => x match { case p1 => e1 ... case p2 => e2 }

def isPrime(n: Int): Boolean =
  (2 until n).map(x => n % x)forall(num => num != 0)

isPrime(13)
isPrime(4)
isPrime(11)