package app

/**
  * Created by john on 29/01/18.
  */
object ReverseKata {

  def reverse(number: Int): List[Int] = {
    val reversed = (0 to number).toList.reverse

    println(reversed)
    reversed
  }

  reverse(5)
}
