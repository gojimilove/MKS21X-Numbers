public class RealNumber{
	private double value;

	public RealNumber(double number) {
		value = number;
	}

	public double getValue() {
		return value;
	}

	public double add(RealNumber other) {
		return value + other.getValue();
	}

	public double subtract(RealNumber other) {
		return value - other.getValue();
	}

	public double multiply(RealNumber other) {
		return value * other.getValue();
	}

	public double divide(RealNumber other) {
		return value / other.getValue();
	}

	public String toString() {
		return ""+value;
	}

}
