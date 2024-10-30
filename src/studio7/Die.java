package studio7;

public class Die {

	private int numSides;
	
	public Die(int initNumSides) {
		numSides = initNumSides;
	}
	
	public int roll() {
		return (int) (Math.random() * numSides + 1);	
	}
		
	public static void main(String[] args) {
		Die d1 = new Die(20);
		System.out.println("Number of side: " + d1.numSides);
		int i = 0;
		while(i < 100) {
			System.out.println(d1.roll());
			i++;
		}	
	}
}
