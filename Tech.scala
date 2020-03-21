import scala.io.StdIn

// def menu = {
  println("レビュー数：0")
  println("[0]レビューを書く")
  println("[1]レビューを読む")
  println("[2]アプリを終了する")
  var input = StdIn.readInt()

if( input == 0){
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

  println(line)
  println("著者："+name)
  println("タイトル："+tittle)
  println("価格："+price)
  println(line)
}else if( input == 1){
  println("レビュー一覧：")
}else if(input == 2){

}else{
  println("入力された値は無効な値です")
}