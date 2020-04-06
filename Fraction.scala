// 分数の計算
/*
class Rational(n: Int, d: Int){
  // println("Created" + n + "/" + d)
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val numer = n/g
  val demon = d/g
  def this(n: Int) = this(n,1)
  
  def +(that: Rational): Rational =
    new Rational(numer * that.demon + that.numer * demon, demon * that.demon)
  def +(i: Int): Rational =
    new Rational(numer + i * demon, demon)

  def -(that: Rational): Rational =
    new Rational(numer * that.demon - that.numer * demon, demon * that.demon)
  def -(i: Int): Rational =
    new Rational(numer - i * demon, demon)

  def *(that: Rational): Rational =
    new Rational(numer * that.numer, demon * that.demon)
  def *(i: Int): Rational =
    new Rational(numer * i, demon)

  def /(that: Rational): Rational =
    new Rational(numer * that.demon, demon * that.numer)
  def /(i: Int): Rational =
    new Rational(numer, demon * i)

  override def toString = numer + "/" + demon
  private def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b, a % b)
}
*/
