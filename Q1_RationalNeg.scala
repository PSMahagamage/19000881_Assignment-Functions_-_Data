object RationalNeg extends App{
  val p = new Rational(6,5)
  println(p.neg)
}

class Rational (p:Int,q:Int){
  def numerator = p
  def denominator = q

  def neg = new Rational( -this.numerator,this.denominator)
  override def toString = s"$numerator / $denominator"
}
