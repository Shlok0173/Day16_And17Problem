package com.blz.datastrucure;

import java.util.Scanner;

public class FindNumberComputation {
    public static Scanner scanner=new Scanner(System.in);
	public int  search(int low , int high) { 
		if((high-low)==1) 
			return low;
			int mid=low+(high-low)/2;
			System.out.printf(" The is number is less than %d?type true or false" ,mid);
			boolean isLessThan=scanner.nextBoolean();
			if(isLessThan) 
				return search(low,mid);
			else 
				return search(mid,high);
			
		}
		
	public static void main(String args[]) {
		FindNumberComputation find=new FindNumberComputation();
		System.out.println("guss the number of your choice");
		int number=scanner.nextInt();
		int high=(int)Math.pow(2,number);
		int yourNumber=find.search(0, high);
		
	}
	}

