package com.Day2;
import java.util.*;

public class Addition {

	public static void main(String[] args) {
		System.out.println("Welcome to Calculator!!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 Digit:");
		int a = sc.nextInt();
		System.out.print("Enter 2 Digit:");
		int b = sc.nextInt();
		System.out.print("Enter 3 Digit:");
		int c = sc.nextInt();
		
		int res = a+b+c;
		System.out.print("Answer:");
		System.out.print(res);
		
		
	}

}
