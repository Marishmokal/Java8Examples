package pro.practice.basics;

import java.util.Objects;

public class Student {
private int age;
private String name;
private int marks;
private int salary;
Student() {
	super();
	// TODO Auto-generated constructor stub
}
Student(int age, String name, int marks, int salary) {
	super();
	this.age = age;
	this.name = name;
	this.marks = marks;
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public int hashCode() {
	return Objects.hash(age, marks, name, salary);
}
@Override
public String toString() {
	return "Student [age=" + age + ", name=" + name + ", marks=" + marks + ", salary=" + salary + "]";
}



	
}
