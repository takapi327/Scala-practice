/*
class Point(val x: Int, val y: Int) {
  override def toString = s"Point($x, $y)"
}

object Point {
  def apply(x: Int, y: Int): Point = new Point(x, y)
}

case class CPoint(x: Int, y: Int)
 
sealed abstract class DayOfWeek
  case object Sunday    extends DayOfWeek
  case object Monday    extends DayOfWeek
  case object Tuesday   extends DayOfWeek
  case object Wednesday extends DayOfWeek
  case object Thursday  extends DayOfWeek
  case object Friday    extends DayOfWeek
  case object Saturday  extends DayOfWeek

object DayOfWeek extends App {

  def toNum(day: DayOfWeek): Int = {
    day match {
      case Sunday    => 1
      case Monday    => 2
      case Tuesday   => 3
      case Wednesday => 4
      case Thursday  => 5
      case Friday    => 6
      case Saturday  => 7
    }
  }

  def nextDayOfWeek(d: DayOfWeek): DayOfWeek = {
    d match {
      case Sunday    => Monday
      case Monday    => Tuesday
      case Tuesday   => Wednesday
      case Wednesday => Thursday
      case Thursday  => Friday
      case Friday    => Saturday
      case Saturday  => Sunday
    }
  }
  println(nextDayOfWeek(Saturday))
}

case class Student(name: String, grade: Int)
*/


