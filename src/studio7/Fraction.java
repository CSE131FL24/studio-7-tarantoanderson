package studio7;

public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction(int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
	}

	public Fraction multiplyFraction(Fraction fraction2) {
		int newNumerator = numerator * fraction2.numerator;
		int newDenominator = denominator * fraction2.denominator;
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		return newFraction;
	}

	
	public String toString() {
		String result = numerator + "/" + denominator;
		return result;
	}
	
	public Fraction getReciprocal() {
		int newNumerator = denominator;
		int newDenominator = numerator;
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		return newFraction;
	}

	public static void main(String[] args) {
		Fraction f1 = new Fraction(2, 3);
		Fraction f2 = new Fraction(5, 6);
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f1.multiplyFraction(f2).toString());
		System.out.println(f1.getReciprocal().toString());
	}
}
