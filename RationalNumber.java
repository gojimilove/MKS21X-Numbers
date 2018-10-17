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
	
	private void reduce() {
		n = n / gcd(n, d);
		d = d / gcd(n, d);
	}

	public double getValue() {
		return 0;
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
		return (n = other.getNumerator && d = other.getDenominator);
	}

	public String toString() {
		return "" + n + "/" + d;
	}

	private static int gcd(int a, int b) {
		int newa = a;
		int newb = b;
		if (a < b) {
			newa = b;
			newb = a;
		}
		int r = newa % newb;
		while (r != 0) {
			newa = newb;
			newb = r;
			r = newa % newb;
		}
		return newb;
	}

}
