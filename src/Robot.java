
public class Robot extends Intelligence {
	
	public void greets() {
		System.out.println("*In a robot voice* Hello, my name is Gagy.");
	}

	public void answers(double answer) {
		System.out.printf("*In a robot voice* The answer is %.2f.", answer);
	}
	
	public void saysGoodbye() {
		System.out.println("\n*In a robot voice* I'm glad my job is done. Goodbye!");
	}
}
