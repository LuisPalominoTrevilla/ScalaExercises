case class Book(title: String, authors: List[String])

val books = Set(
  Book(
    title = "Moby Dick Program",
    authors = List("Luis P", "Cormen H")
  ),
  Book(
    title = "advanced machinery",
    authors = List("Charles mcguil", "Andrew H", "Cormen H")
  ),
  Book(
    title = "advanced machinery 2",
    authors = List("Cormen H")
  )
)

// All titles whose authors name starts with Cormen
for (book <- books; a <- book.authors if a startsWith("Cormen"))
  yield book.title

for {
    b1 <- books
    b2 <- books
    if b1.title < b2.title
    a1 <- b1.authors
    a2 <- b2.authors
    if a1 == a2
  } yield a1