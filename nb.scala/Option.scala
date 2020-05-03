/*
object Option1 {

  val num = Some(2)

  def main(args: Array[String]): Unit = {
    println(optionQuesstion1(num))
  }

  def optionQuesstion1(num: Option[Int]): Unit = {
    println(num.getOrElse(0))
  }
}

object Option2 {

  val num = Some(2)
  //val num = None

  def main(args: Array[String]): Unit = {
    println(optionQuesstion1(num))
  }

  def optionQuesstion1(num: Option[Int]): Unit = {
    val optNum = num.map(x => x + 3).getOrElse(None)
    println(optNum)
  }
}

object Option3 {

  def main(args: Array[String]): Unit = {
    println(noneTrue)
    println(someTrue)
  }

  val strOpt: Option[String] = Some(" ")
  val noneTrue = strOpt.isEmpty
  val someTrue = strOpt.isDefined
}

object Option4 {

  val num = Some(Some(2))

  def main(args: Array[String]): Unit = {
    println(optionQuesstion4(num))
  }

  def optionQuesstion4(num: Option[Option[Int]]): Unit = {
    //val someNum = num.flatMap(x => x.map(y => y * 2))
    for {
      n <- num.get.map(x => Some(x * 2))
    }
    println(n)
  }
}
*/
