package study.zhaozhu.java.scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ScannerNext {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {

			int n = scan.nextInt();

			List<Student> list = new ArrayList<>();

			while (n > 0) {
				Student student = new Student();
				student.setName(scan.next());
				student.setScore(Integer.parseInt(scan.next()));
				list.add(student);
				n--;
			}

			Student mc = new Student();

			Collections.sort(list, mc);
			for (Student s : list) {
				System.out.println(s.getName() + " " + s.getScore());
			}
			list.clear();
		}
	}
}

class Student implements Comparator<Student> {
	private String name;
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compare(Student s1, Student s2) {
		Integer int1 = s1.score;
		Integer int2 = s2.score;
		return int2.compareTo(int1);
	}
}