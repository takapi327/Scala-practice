// while分の使用法
// var i = 0
// while (i < args.length) {
//   if (i != 0)
//     print("")
//   print(args(i))
//   i += 1
// }
// println()

// foreach分の使用法
// args.foreach(println)

// for分の使用法
// for (arg <- args)
//   println(arg)

// 配列の使用法
// val num = Array("zero", "one", "two")
// val num = new Array[String](3)
// num(0) = "Hello"
// num(1) = "world"
// num(2) = "!"
// for(i <- 0 to 2)
//   println(num(i))

// import scala.io.Source

// if(args.length > 0){
//   for(line <- Source.fromFile(args(0)).getLines())
//     println(line.length + "" + line)
// }else
//   Console.err.println("Please enter filename")