package pro.practice.basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StudentTest {
public static void main(String[] args) {
	
	Student s1=new Student(22,"Ganesh",72,24032);
	Student s2=new Student(30,"Rupansh",35,72000);
	Student s3=new Student(38,"Vidya",48,12000);
	Student s4=new Student(20,"Akshay",98,45000);
	Student s5=new Student(27,"Rudransh",98,8000);
	Student s6=new Student(17,"Shubhak",55,24000);
	
	
	List<Student>student=new ArrayList<>();
	student.add(s5);
	student.add(s6);
	student.add(s1);
	student.add(s4);
	student.add(s3);
	student.add(s2);
	
	//Student earning >45000
	List<Student>collect = student.stream().filter(Student->Student.getSalary()>=45000).collect(Collectors.toList());
	System.out.println(collect);
	
	//Sum of Salary
	int sum = student.stream().mapToInt(Student::getSalary).sum();
	System.out.println(sum);
	
	//Max Salary
	OptionalInt max = student.stream().mapToInt(Student::getSalary).max();
	System.out.println(max);
	
	//Min Salary
	OptionalInt min = student.stream().mapToInt(Student::getSalary).min();
	System.out.println(min);
	
	//Average
	OptionalDouble average = student.stream().mapToDouble(Student::getSalary).average();
	System.out.println(average);
	
	
	//Sort By Salary
List<Student> collect2 = student.stream().sorted(Comparator.comparingInt(Student::getSalary)).collect(Collectors.toList());
System.out.println(collect2);

//Sort By age
List<Student> collect3 = student.stream().sorted(Comparator.comparingInt(Student::getAge)).collect(Collectors.toList());
System.out.println(collect3);

//sort By name
List<Student> collect4 = student.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
System.out.println(collect4);

//Sort by Marks
List<Student> collect5 = student.stream().sorted(Comparator.comparingInt(Student::getMarks)).collect(Collectors.toList());
System.out.println(collect5);



	
}
}
