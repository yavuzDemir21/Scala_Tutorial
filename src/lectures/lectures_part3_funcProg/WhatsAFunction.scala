package lectures.lectures_part3_funcProg

object WhatsAFunction extends App {

  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }


  val stringToInt = new Function1[String, Int] {
    override def apply(v1: String): Int = v1.toInt
  }

  val adder = new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }


}


trait MyFunction[A, B]{
  def apply(element: A): B
}