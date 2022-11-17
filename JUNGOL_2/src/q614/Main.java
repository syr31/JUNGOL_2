package q614;

import java.util.Scanner;

class Information {
	private String school;
	private int grade;

	public Information(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}

	public void print() {
		System.out.printf("%d grade in %s School\n", grade, school);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp1 = sc.next();
		int inp2 = sc.nextInt();
		sc.close();

		Information inf1 = new Information("Jejuelementary", 6);
		Information inf2 = new Information(inp1, inp2);

		inf1.print();
		inf2.print();
	}

}