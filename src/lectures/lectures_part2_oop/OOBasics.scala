package lectures.lectures_part2_oop

object OOBasics extends App  {

  val person = new Person()

  println(person.x)

  person.greet("hatice")

}


class Person(name: String, val age: Int) {

  val x = 2

  println(1+3)


  def greet(name: String): Unit = println(s"${this.name} says: hi $name")

  def this(name: String) = this(name, 0)

  def this() = this("yavuz demir")

}




class Counter(val count: Int){

  def inc = new Counter(count+1)

  def dec = new Counter(count-1)

  def inc(n: Int) = new Counter(count+n)

  def dec(n: Int) = new Counter(count-n)



}