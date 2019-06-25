package lectures.Lectures_part4_pm

import scala.util.Random

object PatternMatching extends App {

  val random = new Random

  val x = random.nextInt(10)


  val description = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "else"
  }

  println(x + "   " + description)


  case class Person(name: String, age: Int)

  val bob = Person("Bob", 20)

  val greeting = bob match {
    case Person(n, a) => s"name $n age $a"
    case _ => "not a defined person"
  }

  println(greeting)


  trait Expr
  case class Number(n: Int) extends Expr
  case class Sum(e1: Expr, e2: Expr) extends Expr
  case class Prod(e1: Expr, e2: Expr) extends Expr




}
