// Create stream range #:: is the cons operator of a stream
def streamRange(lo: Int, hi: Int): Stream[Int] =
  if (lo > hi) Stream.empty
  else lo #:: streamRange(lo+1, hi)

streamRange(1, 10)
streamRange(1, 10).take(3)
streamRange(1, 10).take(3).toList


(1 to 10).toStream

// Infinite streams
def from(n: Int): Stream[Int] = n #:: from(n+1)

// Stream of all natural numbers:
val nat = from(0)
// Stream of multiples of 4
val ms4 = nat map (_*4)

(ms4 take 100) toList

def sieve(s: Stream[Int]): Stream[Int] =
  s.head #:: sieve(s.tail filter (_ % s.head != 0))

lazy val primes = sieve(from(2))
(primes take 10) toList