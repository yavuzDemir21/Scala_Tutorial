package lectures.lectures_part1_basics

object StringOps extends App {
  val str: String = "Hello, I am learning Scala"

  // Java land methods

  println(str.charAt(2)) // "l"
  println(str.substring(7, 11)) // "I am"
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  // Scala specific

  val aNumberSting = "45"
  val aNumber: Int = aNumberSting.toInt
  println('a' +: aNumberSting :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // S-interpolators
  val name = "Denis"
  val age = 27
  println(s"Hello, my name is $name and I am $age years old")
  println(s"Hello, my name is $name and I will be turning ${age + 1} years old")

  // F-interpolators
  val speed = 1.2f
  println(f"$name%s can eat $speed%2.2f burgers per minute")

  // raw-interpolator
  println(raw"This is a \n newline") // does not escape \n character

  val escaped = "This is a \n newline"
  println(raw"$escaped") // \n is escaped (sic!)

}
