package lectures.lectures_part2_oop

object Inheritance extends App {

  // Scala has single class inheritance
  class Animal {
    val creatureType = "wild"

    def eat = println("omnomnom")

    // is not accessible in ancestors
    private def notThisTime = println("ouch")

    // is accessible INSIDE ancestors
    protected def callMe = println("yay")
  }

  class Cat extends Animal {
    def calling = {
      callMe
    }
  }

  val cat = new Cat
  cat.eat

  // cat.notThisTime

  // cat.callMe // still can not be called outside
  cat.calling


  // constructors
  class Person(name: String, age: Int) {
    def this(name: String)= this(name, 0)
  }

  // during extension a proper constructor should be called with parameters
  class Adult(name: String, age: Int, idCard: String) extends Person(name /*, age*/)


  // overriding
  class Dog(override val creatureType: String = "domestic") extends Animal {

    override def eat = println("crunch, crunch")
  }

  val dog = new Dog
  dog.eat
  println(dog.creatureType)


  // type substitution
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat // crunch, crunch
  println(unknownAnimal.creatureType)


  // super
  class Mouse extends Animal {
    override def eat = {
      super.eat
      println("pi, pi, pi")
    }
  }

  val mouse = new Cat
  mouse.eat


  // prevent overriding
  // 1 - "final" modifier on method or val
  // 2 - "final" modifier on the entire class
  // 3 - seal the class = extend class in THIS FILE, prevent extension in the other files

}
