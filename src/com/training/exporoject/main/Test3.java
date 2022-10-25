package com.training.exporoject.main;

import com.training.exporoject.entity.Student;


public class Test3 {

	public static void main(String[] args) {
			
		Student s1 = new Student(new int[] {10, 10, 9, 9, 10}, "Ivan", "Fatin1", "4f");
		Student s2 = new Student(new int[] {6, 7, 8, 9, 10}, "Ivan", "Fatin2", "8f");
		Student s3 = new Student(new int[] {6, 7, 8, 7, 4}, "Ivan", "Fatin3", "5f");
		Student s4 = new Student(new int[] {9, 9, 9, 9, 9}, "Ivan", "Fatin4", "4f");
		Student s5 = new Student(new int[] {6, 7, 8, 9, 10}, "Ivan", "Fatin5", "4f");
		Student s6 = new Student(new int[] {6, 7, 8, 1, 10}, "Ivan", "Fatin6", "6f");
		Student s7 = new Student(new int[] {9, 9, 9, 9, 10}, "Ivan", "Fatin7", "4f");
		Student s8 = new Student(new int[] {6, 7, 8, 9, 5}, "Ivan", "Fatin8", "4f");
		Student s9 = new Student(new int[] {6, 7, 8, 9, 10}, "Ivan", "Fatin9", "6f");
		Student s10 = new Student(new int[] {6, 7, 8, 9, 10}, "Ivan", "Fatin10", "4f");

		
		Student[] students = new Student[] {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};
		
		Student.getGoodStudents(students);
	}

}
