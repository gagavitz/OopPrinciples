
public class Human extends Intelligence {
	
	public void greets() {
		System.out.println("*In a human voice* Hello, my name is Gagy.");
	}

	public void answers(double answer) {
		System.out.printf("*In a human voice* The answer is %.2f.", answer);
	}
	
	public void saysGoodbye() {
		System.out.println("\n*In a human voice* I'm glad my job is done. Goodbye!");
	}
}
