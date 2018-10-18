public class RationalNumber extends RealNumber{
	private int n,d;

	public RationalNumber(int num, int den) {
		super(0);
		n = num;
		d = den;
		if (d < 0) {
			n = num * -1;
			d = den * -1;
		}
		if (d == 0) {
			n = den;
			d = num;
		}
		reduce();
	}

	public double getValue() {
		return (double)n / d;
	}

	public String toString() {
		if (n == 0) return "0";
		if (d == 1) return ""+n;
		return "" + n + "/" + d;
	}

	private void reduce() {
		int num = n;
		int den = d;
		n = num / gcd(num, den);
		d = den / gcd(num, den);
	}

	public int getNumerator() {
		return n;
	}

	public int getDenominator() {
		return d;
	}

	public RationalNumber reciprocal() {
		RationalNumber newReciprocal = new RationalNumber(d, n);
		return newReciprocal;
	}

	public boolean equals(RationalNumber other) {
		return (n == other.getNumerator() && d == other.getDenominator());
	}

	private static int gcd(int a, int b) {
		int x = Math.max(Math.abs(a), Math.abs(b));
		int y = Math.min(Math.abs(a), Math.abs(b));
		if (y == 0) return x;
		else {
			return gcd(y, x % y);
		}

	}

	public RationalNumber multiply(RationalNumber other){
    RationalNumber multiplied = new RationalNumber((n * other.getNumerator()), (d * other.getDenominator()));
    return multiplied;
  }


  public RationalNumber divide(RationalNumber other){
  	RationalNumber divided = new RationalNumber((n * other.getDenominator()), (d * other.getNumerator()));
    return divided;
  }
  
  public RationalNumber add(RationalNumber other){
  	RationalNumber added = new RationalNumber((n * other.getDenominator() + other.getNumerator() * d), (d * other.getDenominator()));
    return added;
  }
  
  public RationalNumber subtract(RationalNumber other){
    RationalNumber subtracted = new RationalNumber((n * other.getDenominator() - other.getNumerator() * d), (d * other.getDenominator()));
    return subtracted;
  }

}
