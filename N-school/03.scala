

// N-School 03
/*
import scala.math.sqrt

object Factorization extends App {
  def factorization(target: Int): Map[Int, Int] = {
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
    factorizationRec(target, 2, Map())
  }
  Seq(32, 25, 90, 510510).map(x => println(factorization(x)))
  //println(factorization(510510))
}

object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (a == 0){
      return b
    } else if (b == 0) {
      return a
    } else {
      greatestCommonDivisor(b, a % b)
    }
  }
  println(greatestCommonDivisor(36, 24))
}
*/


/*
import scala.math.sqrt

object Factorization extends App {
  def factorization(target: Int): Map[Int, Int] = {
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
    factorizationRec(target, 2, Map())
  }
  Seq(32, 25, 90, 510510).map(x => println(factorization(x)))
  //println(factorization(510510))
}

object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (a == 0){
      return b
    } else if (b == 0) {
      return a
    } else {
      greatestCommonDivisor(b, a % b)
    }
  }
  println(greatestCommonDivisor(36, 24))
}
*/


/*
import scala.math.sqrt

object Factorization extends App {
  def factorization(target: Int): Map[Int, Int] = {
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
    factorizationRec(target, 2, Map())
  }
  Seq(32, 25, 90, 510510).map(x => println(factorization(x)))
  //println(factorization(510510))
}

object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (a == 0){
      return b
    } else if (b == 0) {
      return a
    } else {
      greatestCommonDivisor(b, a % b)
    }
  }
  println(greatestCommonDivisor(36, 24))
}
*/


/*
import scala.math.sqrt

object Factorization extends App {
  def factorization(target: Int): Map[Int, Int] = {
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
    factorizationRec(target, 2, Map())
  }
  Seq(32, 25, 90, 510510).map(x => println(factorization(x)))
  //println(factorization(510510))
}

object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (a == 0){
      return b
    } else if (b == 0) {
      return a
    } else {
      greatestCommonDivisor(b, a % b)
    }
  }
  println(greatestCommonDivisor(36, 24))
}
*/


/*
import scala.math.sqrt

object Factorization extends App {
  def factorization(target: Int): Map[Int, Int] = {
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
    factorizationRec(target, 2, Map())
  }
  Seq(32, 25, 90, 510510).map(x => println(factorization(x)))
  //println(factorization(510510))
}

object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (a == 0){
      return b
    } else if (b == 0) {
      return a
    } else {
      greatestCommonDivisor(b, a % b)
    }
  }
  println(greatestCommonDivisor(36, 24))
}
*/


/*
import scala.math.sqrt

object Factorization extends App {
  def factorization(target: Int): Map[Int, Int] = {
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
    factorizationRec(target, 2, Map())
  }
  Seq(32, 25, 90, 510510).map(x => println(factorization(x)))
  //println(factorization(510510))
}

object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (a == 0){
      return b
    } else if (b == 0) {
      return a
    } else {
      greatestCommonDivisor(b, a % b)
    }
  }
  println(greatestCommonDivisor(36, 24))
}
*/


/*
import scala.math.sqrt

object Factorization extends App {
  def factorization(target: Int): Map[Int, Int] = {
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
    factorizationRec(target, 2, Map())
  }
  Seq(32, 25, 90, 510510).map(x => println(factorization(x)))
  //println(factorization(510510))
}

object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (a == 0){
      return b
    } else if (b == 0) {
      return a
    } else {
      greatestCommonDivisor(b, a % b)
    }
  }
  println(greatestCommonDivisor(36, 24))
}
*/


