object overrides {

  abstract class Base {
    def foo = 1
    def bar: Int
  }

  class Sub extends Base {
    override def foo = 2
    def bar = 3
  }

  println("Welcome boy")
  val t1 = new Sub
  println(t1.foo)
  println(t1.bar)
}

overrides