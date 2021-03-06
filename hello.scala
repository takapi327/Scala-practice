// 文字の表示
// println("Hello," + args(0) + "!")
// class Main {

//     // 出力
//     print("Hello, World!\n")

//     // 出力して改行
//     println("Hello, World!")

//     // フォーマットして出力
//     printf("Hello, %s!\n", "World")
// }

// def widthOfLength(s: String) = s.length.toString.length
// if(args.length > 0){
//   val lines = Source.fromFile(args(0)).getLines().toList
//   val longestLine = lines.reduceLeft((a,b) => if(a.length > b.length) a else b)

//   val maxWidth = widthOfLength(longestLine)
//   for(line <- lines){
//     val numSpace = maxWidth - widthOfLength(line)
//     val padding = "" * numSpace
//     println(padding + line.length + " | " + line)
//   }
// }else
//   Console.err.println("Please enter filename")

// import scala.collection.mutable
// object ChecksumAccumulator{
// }

// オブジェクト型
// def formatArgs(args: Array[String]): Unit = {
//   var i = 0
//   while (i < args.length){
//     println(args(i))
//     i += 1
//   }
// }

// // 関数型
// def formatArgs(args: Array[String]) = args.mkString("\n")
// // テスト
// val res = formatArgs(Array("hello", "world", "!")) 
// assert(res == "hello\nworld\n!")
/*
class Check{
  private var sum = 0
  def add(b: Byte) = sum += b
  // def check() = ~(sum & 0xFF) + 1
}

// val firstArg = if(args.length > 0) args(0) else ""
// firstArg match{
//   case "salt" => println("pepper")
//   case "chips" => println("salsa")
//   case "eggs" => println("bacon")
//   case _ => println("huh?")
// }

// def printMultiTable() = {
//   var i = 1
//   while(i <= 10){
//     var j = 1
//     while(j <= 10){
//       var prod = (i * j).toString
//       var k = prod.length
//       while (k < 4){
//         print("")
//         k += 1
//       }
//       print(prod)
//       j += 1
//     }
//     println()
//     i += 1
//   }
// }

// import Class.calculate

// object summer {
//   def main(args: Array[String]) = {
//     for(arg <- args)
//       println(arg + ": " + calculate(arg))
//   }
// }

// アサーションとテスト
import org.scalatest.FunSuite
import Element.elem
class ElementSuite extends FunSuite {
  test("elem result should have passed width"){
    val ele = elem('x', 2, 3)
    assert(ele.width == 2)
  }
}

// FlatSpecで振る舞いを規定してテストする
import org.scalatest.FlatSpec
import org.scalatest.Matchers
import Element.elem
class ElementSpec extends FlatSpec with Matchers {
  "A UniformElement" should
    "have a width equal to the passed value" in {
      val ele = elem('x', 2, 3)
      ele.width should be (2)
    }
    it should "have a height equal to the passed value" in {
      val ele = elem('x', 2, 3)
      ele.height should be (3)
    }
    it should "throw an IAE if passed a negative width" in {
      an[IllegalArgumentExeception] should be thrownBy {
        elem('x', 2, 3)
      }
    }
}
*/
