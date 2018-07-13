
public class  Calculation {
	public static double calculate (double numberOne, double numberTwo, int selection) {
		
		double answer = 0;
		
		switch (selection) {
		case 1: 
			answer = (numberOne + numberTwo);
			break;
		case 2: 
			answer = (numberOne - numberTwo);
			break;
		case 3: 
			answer = (numberOne * numberTwo);
			break;
		case 4: 
			answer = (numberOne / numberTwo);
			break;	
		}
		
		return answer;
	}
}
