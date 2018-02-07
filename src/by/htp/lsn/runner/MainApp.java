package by.htp.lsn.runner;

import by.htp.lsn.calc.Calculator;
import by.htp.lsn.input.ConsoleInput;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("App start: ");
		
		Calculator calc = new Calculator();
		ConsoleInput input = new ConsoleInput();
		
		calc.greetUser();
		int value1 = input.readIntValue();
		int value2 = input.readIntValue();
		String operation = input.readOperatio();
		
		int result = calc.performOperation(operation, value1, value2);
		System.out.println("Result: ");
	}

}
