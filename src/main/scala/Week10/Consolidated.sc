import Week10.BankAccount
import frp._

def consolidated(accts: List[BankAccount]): Signal[Int] =
  Signal(accts.map(_.balance()).sum)

val a = new BankAccount()
val b = new BankAccount()
val c = consolidated(List(a, b))
c()
a deposit 100
c()
b deposit 30
c()
a withdraw 80
c()
