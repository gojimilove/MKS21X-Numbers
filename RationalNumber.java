public class RationalNumber extends RealNumber{
	private int n,d;

	public RationalNumber() {

	}

	public RationalNumber(int num, int den) {
		n = num;
		d = den;
	}

	public int getNumerator() {
		return 1;
	}

	public int getDenominator() {
		return 2;
	}

	//constructor
	//get method
	//tostring method
	//fix rounding errors
	//change value of number depending on 1s, 0s, etc (ex: 0 / something, something / 1)
	//compare rational numbers

}