package lectures.lectures_part3_funcProg

object AnonymousFunctions extends App {


  // OOP way
  val OODoubler = new Function1[Int, Int] {
    override def apply(x: Int): Int = x * 2
  }

  println(OODoubler(2))

  //FP way with anonymous (lambda) function
  val FPDoubler = (x: Int) => x * 2

  println(FPDoubler(2))

  // same compiler checks
  val compilerMatchedDoubler: Int => Int = x => x * 2

  // multiple params
  val adder: (Int, Int) => Int = (a, b) => a * b

  // no params
  val justDoSomething: () => Int = () => 3
  // lambda must be called with parenthesis unlike methods
  println(justDoSomething) // function itself
  println(justDoSomething())

  // curly braces with lambdas
  val stringToInt = { (str: String) =>
    str.toInt
  }

  // MOAR syntactic sugar
  val niceIncrementer: Int => Int = _ + 1 // eq to x => x + 1
  val niceAdder: (Int, Int) => Int = _ + _ // eq to (a, b) => a + b



}
