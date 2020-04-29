/*
object ControlSyntax extends App  {

  val age = 4
  val isSchoolStarted = false

  def printIsBaby(age: Int, isSchoolStarted: Boolean): Unit = {
    
    if (1 <= age && age <= 6 && !isSchoolStarted) {
      println("幼児です")
    } else {
      println("幼児ではありません")
    }
  }
  printIsBaby(age, isSchoolStarted)

  def loopFrom0To9(): Unit = {
    var i = 0
    do {
      println(i)
      i += 1
    } while (i < 10)
  }
  println(loopFrom0To9)

  def printRightTriangles(): Unit = {
    for (a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000; if a * a == b * b + c * c) println((a, b, c))
  }
  println(printRightTriangles)
}
*/
