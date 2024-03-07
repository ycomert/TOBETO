package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 266;
		int number2 = 25;
		int number3 = 26;
		int max = number1;
		if (number2 > max) {
			max = number2;
		}
		if (number3 > max) {
			max = number3;
		}
		System.out.println("max number : " + max);
	}

}
