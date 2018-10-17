public class RealNumber{
	private double value;

	public RealNumber(double number) {
		value = number;
	}

	public double getValue() {
		return value;
	}

	public double add(RealNumber other) {
		return value + other;
	}

	public double subtract(RealNumber other) {
		return value - other;
	}

	public double multiply(RealNumber other) {
		return value * other;
	}

	public double divide(RealNumber other) {
		return value / other;
	}

	public String toString() {
		return ""+value;
	}

}
