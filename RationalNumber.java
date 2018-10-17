public class RationalNumber extends RealNumber{
	private int n,d;

	public RationalNumber(int num, int den) {
		super(0);
		n = num;
		d = den;
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
/*
	public RationalNumber reciprocal() {
		RationalNumber newReciprocal = new RationalNumber(d, n);
		return newReciprocal;
	}

	public boolean equals(RationalNumber other) {
		return (n == other.getNumerator() && d == other.getDenominator());
	}
*/
	private static int gcd(int a, int b) {
		return 1;
		//if (b == 0) return a;
		//else return gcd(b, b % a);
	}

}
