package com.training.exporoject.entity;

import java.util.Arrays;


public class Student { 
	
		private int[] succes;
		private String name;
		private String lastName;
		private String numberOfGroup;
		
		public Student() {
			super();
		}
		
		public Student(int[] succes, String name, String lastName, String numberOfGroup) {
			super();
			this.succes = succes;
			this.name = name;
			this.lastName = lastName;
			this.numberOfGroup = numberOfGroup;
		}
		
		public int[] getSucces() {
			return succes;
		}
		public void setSucces(int[] succes) {
			this.succes = succes;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getNumberOfGroup() {
			return numberOfGroup;
		}
		public void setNumberOfGroup(String numberOfGroup) {
			this.numberOfGroup = numberOfGroup;
		}
		
		@Override
		public String toString() {
			return "Student [succes=" + Arrays.toString(succes) + ", name=" + name + ", lastName=" + lastName
					+ ", numberOfGroup=" + numberOfGroup + "]";
		}
		
		public static void getGoodStudents(Student[] students) {
			for(int i = 0; i < students.length; i++) {
				int midle = 0;
				for(int j = 0; j < students[i].getSucces().length; j++){
					midle = midle + students[i].getSucces()[j];
					
				}
				midle = midle / students[i].getSucces().length;
				if (midle >= 9) {
					System.out.println(students[i].getLastName() + " " + students[i].getNumberOfGroup());
					
				}
			}
		}
}
