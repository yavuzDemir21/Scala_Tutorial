package lectures.lectures_part1_basics

object CBNvsCBV extends App {


  def calledByValue(x: Long): Unit = {
    println("by value " + x)
    println("by value " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by value " + x)
    println("by value " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //  printFirst(infinite(), 34) // infinite is evaluated and leads to StackOverflow :(
  printFirst(34+1, infinite()) // infinite is LAZY so it's not evaluated


}
