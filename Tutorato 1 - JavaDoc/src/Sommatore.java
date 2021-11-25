
/**
 * The Class Sommatore.
 */
public class Sommatore {
	
	/** Primo numero */
	int firstNumber;
	
	/** Secondo numero */
	int b;
	
	/**
	 * Instantiates a new sommatore.
	 */
	Sommatore() {
		firstNumber = b = 0;
	}
	
	/**
	 * Instantiates a new sommatore.
	 *
	 * @param a il primo numero
	 * @param b il secondo numero
	 */
	Sommatore(int a, int b) {
		this.firstNumber = a;
		this.b = b;
	}
	
	/**
	 * Sum numbers.
	 *
	 * @return the int representing the sum
	 */
	int sumNumbers() {
		return firstNumber + b;
	}
	
	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
		Sommatore s = new Sommatore(2, 5);
		System.out.println(s.sumNumbers());
	}
}
