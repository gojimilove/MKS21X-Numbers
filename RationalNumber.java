public class RationalNumber extends RealNumber{
	private int n,d;

	public RationalNumber(int num, int den) {
		super(0);
		n = num;
		d = den;
	}

	public double getValue() {
		return 0;
	}

	public int getNumerator() {
		return 1;
	}

	public int getDenominator() {
		return 2;
	}

	public RationalNumber reciprocal() {
		return null;
	}

	public boolean equals(RationalNumber other) {
		return null;
	}

	public String toString() {
		return "0";
	}

	private static int gcd(int a, int b) {

			return 0;
	}

	private void reduce() {

	}

}
