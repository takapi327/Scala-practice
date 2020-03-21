import scala.io.StdIn
import scala.util.control.Breaks._

var post: Array[String] = Array.empty

def post_review = {
  val line = "-----------------------------"
  println(line)
  println("著者を入力してください")
  val name:String = StdIn.readLine()
  println("著者："+name+"\n"+line)
  println("タイトルを入力してください")
  val tittle:String = StdIn.readLine()
  println("タイトル："+tittle+"\n"+line)
  println("価格を入力してください")
  val price:String = StdIn.readLine()
  println("価格："+price+"\n")
  post = post :+ name

  println(line)
  println("著者："+name)
  println("タイトル："+tittle)
  println("価格："+price)
  println(line)
}

def read_reviews = {
  println("レビュー一覧")
  for(i <- post){
    println(i)
  }
}

while(true){
println("レビュー数：" +post.length)
println("[0]レビューを書く")
println("[1]レビューを読む")
println("[2]アプリを終了する")
var input = StdIn.readInt()

if( input == 0){
  post_review
}else if( input == 1){
  read_reviews
}else if(input == 2){
  println("アプリを終了")
  break
}else{
  println("入力された値は無効な値です")
}
}