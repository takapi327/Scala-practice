/*
// N-School 01
object Distance extends App {
  val kilometersPerHours = 11
  val minutes = 100
  val distance = kilometersPerHours * minutes / 60
  println(s"走った距離は${distance}キロメートルです")
}
*/
// N-School 02
/*
object Tax extends App {
  val price    = 129512
  val tax      = 1.08
  val taxPrice = price * tax
  println(taxPrice.toInt + "円です")
}
*/

// N-School 03
import scala.math.sqrt

object Factorization extends App {
  var target     = 510510
  val maxDivisor = sqrt(target).toInt

  def factorizationRec(num: Int, divisor: Int, acc: Map[Int, Int]): Map[Int, Int] = {
    if(divisor > maxDivisor){
      if(num == 1) acc else acc + (num -> 1)
    } else if (num % divisor == 0){
      val nextAcc = acc + (divisor -> (acc.getOrElse(divisor, 0) + 1))
      factorizationRec(num / divisor, divisor, nextAcc)
    } else {
      factorizationRec(num, divisor + 1, acc)
    }
  }
  println(factorizationRec(target, 2, Map()))
}
