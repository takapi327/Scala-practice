// println("Hello, world, from a script!")

// class Main {

//     // 出力
//     print("Hello, World!\n")

//     // 出力して改行
//     println("Hello, World!")

//     // フォーマットして出力
//     printf("Hello, %s!\n", "World")
// }


// var i = 0
// while (i < args.length) {
//   if (i != 0)
//     print("")
//   print(args(i))
//   i += 1
// }
// println()

// args.foreach((arg: String) => prinln(arg))

// for (arg <- args)
//   println(arg)

// import scala.io.Source

// if(args.length > 0){
//   for(line <- Source.fromFile(args(0)).getLines())
//     println(line.length + "" + line)
// }else
//   Console.err.println("Please enter filename")

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

// class Rational(n: Int, d: Int){
//   // println("Created" + n + "/" + d)
//   require(d != 0)

//   private val g = gcd(n.abs, d.abs)

//   val numer = n/g
//   val demon = d/g
//   def this(n: Int) = this(n,1)
  
//   def +(that: Rational): Rational =
//     new Rational(numer * that.demon + that.numer * demon, demon * that.demon)
//   def +(i: Int): Rational =
//     new Rational(numer + i * demon, demon)

//   def -(that: Rational): Rational =
//     new Rational(numer * that.demon - that.numer * demon, demon * that.demon)
//   def -(i: Int): Rational =
//     new Rational(numer - i * demon, demon)

//   def *(that: Rational): Rational =
//     new Rational(numer * that.numer, demon * that.demon)
//   def *(i: Int): Rational =
//     new Rational(numer * i, demon)

//   def /(that: Rational): Rational =
//     new Rational(numer * that.demon, demon * that.numer)
//   def /(i: Int): Rational =
//     new Rational(numer, demon * i)

//   override def toString = numer + "/" + demon
//   private def gcd(a: Int, b: Int): Int =
//     if(b == 0) a else gcd(b, a % b)
// }

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

// def makeRowSeq(row: Int) =
//   // colに1から10までの数字を入れる
//   for(col <- 1 to 10) yield {
//     // rowとcolを掛けて文字列として表示
//     val prod = (row * col).toString
//     // 数字が1桁なら3行空白、2桁なら2行空白
//     val padding = " " * (4 - prod.length)
//     // 空白と数字を表示
//     padding + prod
//   }

// // mkStringで九九の計算1列を1つの文字列にする
// def makeRow(row: Int) = makeRowSeq(row).mkString
// def multiTable() = {
//   val tableSeq =
//     // rowに1から10までの数字を入れる
//     for(row <- 1 to 10)
//     yield makeRow(row)
//   // 改行を追加している
//   tableSeq.mkString("\n")
// }

import scala.io.StdIn

def register_book() =
  println("本の登録")
  println("著者を入力してください")
  val name:String = StdIn.readLine()
  println("タイトルを入力してください")
  val tittle:String = StdIn.readLine()
  println("価格を入力してください")
  val price:String = StdIn.readLine()

  println("著者："+name)
  println("タイトル："+tittle)
  println("価格："+price)