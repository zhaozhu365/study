package study.zhaozhu.java.scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ScannerNextLine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNextLine()) {
			int n = Integer.parseInt(scan.nextLine());
			List<Student> list = new ArrayList<>();

			while (n > 0) {
				Student student = new Student();

				if (scan.hasNextLine()) {
					String line = scan.nextLine();
					student.setName(line.split(" ")[0]);
					student.setScore(Integer.parseInt(line.split(" ")[1]));
					list.add(student);
				}
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

class Student1 implements Comparator<Student1> {
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
	public int compare(Student1 s1, Student1 s2) {
		Integer int1 = s1.score;
		Integer int2 = s2.score;
		return int2.compareTo(int1);
	}
}