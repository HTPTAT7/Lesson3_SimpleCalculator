package by.htp.lsn.calc;

public class Calculator {

	public void greetUser() {
		System.out.println("Shake hand!");
		System.out.println("Kiss user!");
		System.out.println("Greet User");
	}

	public int multiply(int x, int y) {
		int result = x * y;
		return result;
	}

	public int sumup(int x, int y) {
		int result = x + y;
		return result;
	}

	public int subtract(int x, int y) {
		int result = x - y;
		return result;
	}

	public int divide(int x, int y) {
		int result = x / y;
		return result;
	}

	public int increment(int b) {
		b++;
		System.out.println(b);
		return b;
	}

	public int performOperation(String operation, int value1, int value2) {

		int result = 0;
		switch (operation) {
		case "*":
			result = multiply(value1, value2);
			break;
		case "/":
			result = divide(value1, value2);
			break;
		case "+":
			result = sumup(value1, value2);
			break;
		case "-":
			result = subtract(value1, value2);
			break;
		}
		return result;
	}

}
