import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		int operation;
		double numberOne, numberTwo, answer;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What would you like to do? \n"
				+ "1: Add \n"
				+ "2: Subtract \n"
				+ "3: Multiply \n"
				+ "4: Divide \n");
		
		operation = sc.nextInt();
		
		System.out.println("OK, now give me two numbers:");
		System.out.println("Type in number one? ");
		numberOne = sc.nextDouble();
		
		System.out.println("Thank you.  Now Number two: ");
		numberTwo = sc.nextDouble();
		
		System.out.println("Do you want a human or a robot operator? \n"
				+          "1: Human \n"
				+          "2: Robot");
		
		int operator = sc.nextInt();
		sc.close();
		
		answer = Calculation.calculate(numberOne, numberTwo, operation);
		
		if (operator == 1) {
			Human human = new Human();
			human.greets();
			human.answers(answer);
			human.saysGoodbye();
		} else {
			Robot robot = new Robot();
			robot.greets();
			robot.answers(answer);
			robot.saysGoodbye();
		}
	}

}
