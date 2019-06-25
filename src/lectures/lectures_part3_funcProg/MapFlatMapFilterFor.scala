package lectures.lectures_part3_funcProg

object MapFlatMapFilterFor extends App{

  val list = List(1,2,3)

  println(list)

  println(list.head)


  //map
  println(list.map(_ + 1))

  println(list.map(_ + " is a number"))

  //filter
  println(list.filter(_ > 2))


  // flatmap

  val toPair = (x: Int) => List(x, x+1)

  println(list.flatMap(toPair))

  val numbers = List(1,2,3,4)
  val chars =  List('a', 'b', 'c', 'd')


  val combination = chars.flatMap(c => numbers.filter(_ % 2 == 1).map(n => "" + c + n))

  println(combination)

  list.foreach(println)

  val forCombinations = for {
    c <- chars
    n <- numbers if n % 2 == 0
  } yield "" + c + n

  println(forCombinations)







}
