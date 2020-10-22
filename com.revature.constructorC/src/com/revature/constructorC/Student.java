package com.revature.constructorC;

public class Student {
	
	private int id;
	private int year;
	private int age;
	private int weight;
	private int height;
	private int numClass;
	
	public Student() {
		
	}
	public Student(int id) {
		this(id,2020);
	}
	public Student(int id, int year) {
		this(id,year, 22);
	}
	public Student(int id, int year, int age) {
		this(id,year, age,160);
	}
	public Student(int id, int year, int age, int weight) {
		this(id,year, age,weight,6);
	}
	public Student(int id, int year, int age, int weight, int height) {
		this(id,year, age,weight,height,3);
	}
	
	
	
	
	 
	public Student(int id, int year, int age,int weight, int height, int numClass) {
		this.id=id;
		this.year=year;
		this.age=age;
		this.weight=weight;
		this.height=height;
		this.numClass=numClass;
	}
     public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(01);
		System.out.println(s.toString());
		
		}

	@Override
	public String toString() {
		return "Student [id=" + id + ", year=" + year + ", age=" + age + ", weight=" + weight + ", height=" + height
				+ ", numClass=" + numClass + "]";
	}

}
