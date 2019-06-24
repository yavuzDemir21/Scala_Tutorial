package lectures.lectures_part2_oop

object MethodNotation extends App {

  class Person(val name: String, favoriteMovie: String){
    def likes(movie: String): Boolean = movie == favoriteMovie
  }


}
