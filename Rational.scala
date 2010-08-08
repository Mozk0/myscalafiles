class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  override def toString() = numer + "/" + denom
  def unary_-() = new Rational(-numer, denom)
  def unary_+() = this
  def *(that: Rational) = new Rational(this.numer * that.numer,
                                       this.denom * that.denom)
  def *(that: Int): Rational = this * new Rational(that)
  def +(that: Rational) = new Rational(this.numer * that.denom +
                                       this.denom * that.numer,
                                       this.denom * that.denom)
  def +(that: Int): Rational = this + new Rational(that)
  def /(that: Rational) = this * new Rational(that.denom, that.numer)
  def /(that: Int): Rational = this * new Rational(1, that)
  def -(that: Rational) = this * (-that)
  def -(that: Int) = this + (-that)

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
}
