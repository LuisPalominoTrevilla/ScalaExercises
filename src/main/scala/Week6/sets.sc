val fruit = Set("Apple", "Orange", "Banana")
val s = (1 to 6).toSet

s map(_*2)
fruit filter(_.startsWith("App"))

// Elemental operation on sets: Contains
s contains 4

def queens(n: Int): Set[List[Int]] = {
  def placeQueens(k : Int): Set[List[Int]] =
    if (k == 0) Set(Nil)
    else
      for {
        queens <- placeQueens(k - 1)
        col <- 0 until n
        if isSafe(col, queens)
      } yield col :: queens
  def isSafe(col: Int, queens: List[Int]): Boolean = {
    val rows = queens.length
    val queensWithRow = (rows -1 to 0 by -1) zip queens
    queensWithRow forall {
      case (r, c) => col != c && math.abs(col - c) != rows - r
    }
  }

  placeQueens(n)
}

queens(2)