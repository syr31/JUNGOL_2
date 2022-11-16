package q613;

import java.awt.print.Printable;
import java.util.Scanner;

class Student {
	String name;	// 4
	String school;
	int grade;

	public Student(String name, String school, int grade) {	//3, 매개변수 생성
		this.name = name;				// this 내 자신 생성자로 이동
		this.school = school;
		this.grade = grade;
	}

	public void print() {				// 5번 출력
		System.out.println("name:" + name);
		System.out.println("school:" + school);
		System.out.println("grade:" + grade);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();     // 스캐너 생성
		sc.close();

		Student stu = new Student(name, school, grade);	// 객체생성 2
		stu.print();
	}

}
