def WHILE(condition: => Boolean)(command: => Unit): Unit =
  if (condition) {
    command
    WHILE(condition)(command)
  } else ()

var i = 3
WHILE(i > 0)({i -= 1; println(i)})

def REPEAT(command: => Unit)(condition: => Boolean): Unit = {
  command
  if (condition) ()
  else REPEAT(command)(condition)
}


var test = 1
do {
  print(test + " ")
  test += 1
} while  (test <= 3)

for (i <- 1 until 3) { print(i + " ")}

