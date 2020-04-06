object Main extends App {
  import scala.io.StdIn

  def review = {
    val p = new Preview
    var b = true
    while(b){
      println("レビュー数: " + p.post.length)
      println("[0]レビューを書く")
      println("[1]レビューを読む")
      println("[2]アプリを終了する")
      var input = StdIn.readInt()

      input match {
        case 0 => p.post_review
        case 1 => p.read_review
        case 2 => println("アプリを終了"); b = false
        case other => println("入力された値は無効な値です")
      }
    }
  }
  review

  class Preview {
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

    def read_review = {
      println("レビュー一覧")
      for(i <- post){
        println(i)
      }
    }
  }
}
