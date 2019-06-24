package lectures.lectures_part1_basics

object DefaultAndNamedArgs extends App {

  def factorial(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else factorial(n - 1, n * acc)

  println(factorial(10))

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit =
    println("saving picture")

  savePicture(width = 800) // so we're able to omit leading param
  savePicture(height = 600, format = "png", width = 600) // or even change the passing order

}
