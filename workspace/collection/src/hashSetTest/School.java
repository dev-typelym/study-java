package hashSetTest;

import java.util.HashSet;

public class School {
	public static void main(String[] args) {
		HashSet<Student> studentSet = new HashSet<>();
		
		studentSet.add(new Student(1, "한동석"));
		studentSet.add(new Student(1, "한동석"));
		
		System.out.println(new Student(1, "한동석").equals(new Student(1, "한동석")));
		
		System.out.println(studentSet);
	}
}
