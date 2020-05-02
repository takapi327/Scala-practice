  /*

object Match extends App {
  def printRandomChars(): Unit = {
    for (i <- 1 to 1000) {
      val chars: Seq[Char] = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
      val result = chars match {
        case Seq(a, b, c, d, _) => Seq(a, b, c, d, a)
      }
      println(result)
    }
  }
  println(printRandomChars)

  def last(seq: Seq[Int]): Int = {
    seq match {
      case Seq(x) => return x
      case x::xs => last(xs)
    }
  }
  println(last(Seq(1,2,3)))


  def reverse(seq: Seq[Int]): Seq[Int] = {
    seq match {
      case Seq(x) => Seq(x)
      case x::xs => reverse(xs) :+ x
    }
  }
  println(reverse(Seq(1, 2, 3)))
}
  */
