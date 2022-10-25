package com.training.exporoject.entity;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction() {
		numerator = 0;
		denominator = 1;
	}
	
	public Fraction(int _numerator, int _denominator) {
		numerator = _numerator;
		if(_denominator == 0) {
			throw new RuntimeException("The denomination is zero.");
		}
		denominator = _denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int _denominator) {
		if(_denominator == 0) {
			throw new RuntimeException("The denominator is zero.");
		}
		denominator = _denominator;
	}
	
	public Fraction addition(Fraction f) {
		int num, den;
		
		den = denominator * f.denominator;
		num = numerator * f.denominator + 
				f.numerator * denominator;

	Fraction result = new Fraction(num, den);
		return result;
	}
	public Fraction subtraction(Fraction f) {
	
		int num, den;
	
		den = denominator * f.denominator;
		num = numerator * f.denominator - f.numerator * denominator;
	
		Fraction result = new Fraction(num, den);
			return result;
	}
	public Fraction multiplication(Fraction f) {
	
		int num, den;
		
	den = denominator * f.denominator;
	num = numerator * f.numerator;
	
	Fraction result = new Fraction(num, den);
	
		return result;
	}
	
	public Fraction division(Fraction f) {
		int num, den;
		
	den = denominator * f.numerator;
	num = numerator * f.denominator;
	
	Fraction result = new Fraction(num, den);
		return result;
	}
	
	public void reduction() {
		int x = numerator;
		int y = denominator;
		
		while(x != 0 && y != 0) {
			if (x > y) {
				x = x % y;
			}else {
				y = y % x;
			}
		}
		return x + y;
	}
}

