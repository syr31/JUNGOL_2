package q613;

import java.awt.print.Printable;
import java.util.Scanner;

class Student {
	String name;	// 4
	String school;
	int grade;

	public Student(String name, String school, int grade) {	//3, �Ű����� ����
		this.name = name;				// this �� �ڽ� �����ڷ� �̵�
		this.school = school;
		this.grade = grade;
	}

	public void print() {				// 5�� ���
		System.out.println("name:" + name);
		System.out.println("school:" + school);
		System.out.println("grade:" + grade);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();     // ��ĳ�� ����
		sc.close();

		Student stu = new Student(name, school, grade);	// ��ü���� 2
		stu.print();
	}

}
