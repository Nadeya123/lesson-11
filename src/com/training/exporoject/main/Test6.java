package com.training.exporoject.main;

import java.util.Scanner;

import com.training.exporoject.entity.Time;

public class Test6 {

	public static void main(String[] args) {
		Time a = new Time(5, 44, 3);
		a.print();
		Time b = Time.read(new Scanner(System.in));
		b.addHh(-2);
		System.out.println("change hours>" + b.toString());
		b.addMm(-40);
		System.out.println("change minutes>" + b.toString());
		b.addSs(-30);
		System.out.println("change seconds>" + b.toString());
	}
}