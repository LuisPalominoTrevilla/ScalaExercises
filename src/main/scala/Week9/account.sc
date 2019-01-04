import Week9.BankAccount

val acct = new BankAccount
val act2 = new BankAccount
act2 == acct
val same = acct
same == acct
acct.deposit(50)

acct.withdraw(20)
acct.withdraw(20)
//acct.withdraw(30)


val l1 = List(1,2)
val l2 = List(1,2)
l1 == l2