package tester;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

import utils.StudentCollectionUtils;

public class Test1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			List<Student> students = StudentCollectionUtils.populateList();
			Map<String, Student> map = StudentCollectionUtils.populateMap(students);
			
//			Display all student details from the student map.
//			is map iterable? No. so convert it to collection view 
			//Collection<Student> studs = map.values();
			map.values().forEach(s -> System.out.println(s));
			System.out.println("______________________________");
		
//			________________________________________________________________
			//Display student details of the students who have taken a specified subject 
			
//			map.values()
//			.stream()
//			.filter(s -> s.getSubject().equals(Subject.JAVA))
//			.forEach(s -> System.out.println(s));
//			
//			___________________________________________________________
			
//			Print sum of  marks of students of all students from the specified state
//			i/p : name of the state
//			double sum = map.values()
//			.stream()
//			.filter(s -> s.getAddress().getState().equals("TN"))
//			.mapToDouble(s -> s.getGpa())
//			.sum();
//			
//			System.out.println(sum);
			
			//failures
//			long failures = map.values().stream()
//					.filter(s -> s.getGpa() < 5.0)
//					.count();
//			System.out.println(failures);
			
//				
			 //Display names of students enrolled in a specified subject , securing marks > specified marks
//			System.out.println("Enter subject and marks:");
//			Subject subject = StudentCollectionUtils.parseSubject(sc.next());
//			double specifiedMarks = sc.nextDouble();
//			
//			map.values().stream()
//			.filter(s -> 
//				s.getSubject().equals(subject) && s.getGpa() > specifiedMarks
//			).forEach(s -> System.out.println(s));
			
			
			//topper
//			double higestMarks = map.values().stream()
//					.mapToDouble(s -> s.getGpa())
//					.max(); 	
//			
//			Student topper = map.values().stream().filter(s -> s.getGpa() == higestMarks).findFirst();
//		
		}
		
	}

}
