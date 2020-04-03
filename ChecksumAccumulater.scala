// クラス、フィールド、メソッドの使い方
// class Class {
//   var sum = 0
// }

// val acc = new Class
// val csa = new Class

class Class {
  private var sum = 0
  def add(b: Byte) = sum += b 
  def checksum() = ~(sum & 0xFF) + 1
}

// シングルトンオブジェクトの使い方
import scala.collection.mutable
object Class {
  // 計算したchecksumをキャッシュしておく
  private val cache = mutable.Map.empty[String, Int]
  def calculate(s: String): Int =
    // 渡された文字列がすでにキャッシュされているかをチェックする。
    if(cache.contains(s))
      cache(s)
    else {
      // 新たにインスタンスを生成
      val acc = new Class
      for(c <- s)
        // 文字のtoByteメソッドでByteに変換し、sccの参照するClassのaddメソッドに渡す。
        acc.add(c.toByte)
      val cs = acc.checksum()
      // 渡された文字列のキーと整数の値とを対応させ、cacheマップに追加する。
      cache += (s -> cs)
      cs
    }
}