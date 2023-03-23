package com.conditions;
import java.util.Iterator;
import java.util.Scanner;
public class loops {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.print("Enter a number: ");
	int i=in.nextInt();
//	while(i<=100){
//	System.out.println(i);	
//	i++;
	for (int num=1;num<=i;num++) {
		System.out.println(num);
	}

	}
}
