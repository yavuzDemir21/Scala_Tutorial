package lectures.lectures_part2_oop

object Objects extends App {

  // Scala does not have class-level functionality, e.g. "statics"
  object Person { // this is also a "type"@
    val N_EYES = 2

    def canFly: Boolean = true

    // factory method
    def from(mother: Person, father: Person): Person = new Person("Bobbie")

    // or more conveniently
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  // common approach:
  // "static" class-level functionality is defined in objects
  // instance-level functionality inside class
  // class and object in combination are called "companions"
  class Person(val name: String) {

  }

  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object is Singleton
  val mary = new Person("Mary")
  val john = new Person("John")

  println(mary == john)

  var bobbie = Person.from(mary, john)

  // Singleton becomes callable!
  var conciseBobbie = Person(mary, john)

  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit

}
