package co.edu.unbosque.view;

import java.util.Scanner;

public class ConsoleView {
	private Scanner sc = new Scanner(System.in);

	public ConsoleView() {

	}

	public void showMessage(String message) {
		System.out.println(message);
	}

	public void showMessage(int message) {
		System.out.println(message);
	}

	public int readInt() {
		return sc.nextInt();
	}

	public String readString() {
		return sc.nextLine();
	}
}
