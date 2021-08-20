object RationalSub extends App{
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)
  println((x.sub(y)).sub(z))
}

class Rational (p:Int,q:Int){
  def numerator = p
  def denominator = q

  def sub(r: Rational) = new Rational(numerator*r.denominator - r.numerator*denominator, denominator*r.denominator)
  override def toString = s"$numerator / $denominator"

}
