package com.training.exporoject.entity;

import java.util.Scanner;

public class Time {
	private int hh;
	private int mm;
	private int ss;

	public Time(int hh, int mm, int ss) {
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}

	public Time() {
	}

	public void setHh(int hh) {
		if ((hh > 0) & (hh < 24)) {
			this.hh = hh;
		} else {
			hh = 0;
		}
	}

	public void setMm(int mm) {
		if ((mm > 0) & (mm < 60)) {
			this.mm = mm;
		} else {
			mm = 0;
		}
	}

	public void setSs(int ss) {
		if ((ss > 0) & (ss < 60)) {
			this.ss = ss;
		} else {
			ss = 0;
		}
	}

	public int getHours() {
		return hh;
	}

	public int getMinutes() {
		return mm;
	}

	public int getSeconds() {
		return ss;
	}

	public void print() {
		System.out.println(toString());
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", hh, mm, ss);
	}

	public static Time read(Scanner scanner) {

		Time time = new Time();
		System.out.println("hh: ");
		time.setHh(scanner.nextInt());

		System.out.println("mm: ");
		time.setMm(scanner.nextInt());

		System.out.println("ss: ");
		time.setSs(scanner.nextInt());

		return time;
	}

	public void addHh(int hh) {
		this.hh = this.hh + hh;
		if (this.hh > 24) {
			this.hh = this.hh - 24;
		}
	}

	public void addMm(int mm) {
		this.mm = this.mm + mm;

		if (this.mm > 60) {
			this.mm = this.mm - 60;

			if (this.hh == 23) {
				this.hh = 0;
			} else {
				this.hh = this.hh + 1;
			}
		}
	}

	public void addSs(int ss) {
		this.ss = this.ss + ss;

		if (this.ss > 60) {
			this.ss = this.ss - 60;

			if (this.mm == 59) {
				this.mm = 0;

				if (this.hh == 23) {
					this.hh = 0;
				} else {
					this.hh = this.hh + 1;
				}
			} else {
				this.mm = this.mm + 1;
			}
		}

	}
}