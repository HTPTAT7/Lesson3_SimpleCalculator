package by.htp.lsn.input;

import java.util.Scanner;

public class ConsoleInput {

	public int readIntValue() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter int value");
		int value = sc.nextInt();
		return value;

	}

	public String readOperatio() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter int value");
		String value = sc.next();
		return value;

	}
}
