package com.training.exporoject.main;

import com.training.exporoject.entity.Fraction;

public class Main {
	
	public static void main (String[] args) {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(5, 6);
		
		Fraction rez;
		rez = f1.addition(f2);
		
		System.out.println(rez.getNumerator() + "/" + rez.getDenominator());
	}

}
