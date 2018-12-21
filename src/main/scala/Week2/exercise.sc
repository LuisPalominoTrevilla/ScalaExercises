object exercise {
  def factorial(n: Int): Int = {
    def factorial_helper(acum: Int, n: Int): Int = {
      if (n == 1) acum
      else factorial_helper(acum * n, n - 1)
    }

    factorial_helper(1, n)
  }
}

exercise.factorial(4)