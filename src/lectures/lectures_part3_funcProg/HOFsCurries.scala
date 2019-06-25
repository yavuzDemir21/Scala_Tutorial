package lectures.lectures_part3_funcProg

object HOFsCurries extends App {

  //val superFunction: (Int, (String, (Int => Boolean)) => (Int => Int)) = ???
  //HOF


  // function params : function, #times, x (subject)


  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if(n <= 0) x
    else nTimes(f, n-1, f(x))


  val plusOne = (x: Int) => x+1

  println(nTimes(plusOne, 5, 5))

}
