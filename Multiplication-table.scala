// 九九の計算
/*
def makeRowSeq(row: Int) =
  // colに1から10までの数字を入れる
  for(col <- 1 to 10) yield {
    // rowとcolを掛けて文字列として表示
    val prod = (row * col).toString
    // 数字が1桁なら3行空白、2桁なら2行空白
    val padding = " " * (4 - prod.length)
    // 空白と数字を表示
    padding + prod
  }

// mkStringで九九の計算1列を1つの文字列にする
def makeRow(row: Int) = makeRowSeq(row).mkString
def multiTable() = {
  val tableSeq =
    // rowに1から10までの数字を入れる
    for(row <- 1 to 10)
    yield makeRow(row)
  // 改行を追加している
  tableSeq.mkString("\n")
}
*/
