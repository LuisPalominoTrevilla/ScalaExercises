val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)
val capitalOfCountry = Map("US" -> "Washington", "Germany" -> "Berlin")

capitalOfCountry("US")
capitalOfCountry contains "Mexico"
capitalOfCountry get "Mexico"
capitalOfCountry get "US"

def showCapital(country: String): String = capitalOfCountry.get(country) match {
  case Some(capital) => capital
  case None => "missing data"
}

showCapital("Mexico")

val fruits = List("apple", "pear", "orange", "pineapple")

fruits sortWith (_.length < _.length)
fruits.sorted

fruits groupBy (_.head)