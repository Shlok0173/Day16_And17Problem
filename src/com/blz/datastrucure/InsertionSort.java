package com.blz.datastrucure;

import java.util.Scanner;

public class InsertionSort {

	static Scanner scanner=new Scanner(System.in);
	
	static public void insertionSort(String[] array) {
		for(int i=1;i<array.length;i++) {
			String key=array[i];
			int j=i-1;
			while(j>=0&&(key.compareTo(array[j])<0)) {
				array[j+1]=array[j];
				--j;
			}
			array[j+1]=key;
		}
	}
	static public void printString(String []strings) {
		for(int i=0;i<strings.length;i++) {
			System.out.println("String are index"+i+"is"+strings[i]);
		}
	}
	static public void scanStrings(String[] strings) {
		for(int i=0;i<strings.length;i++) {
			System.out.printf("Enter The String",i);
			strings[i]=scanner.nextLine();
		}
	}
	public static void main(String args[]) {
		String[] string=new String[5];
		scanStrings(string);
		printString(string);
		System.out.println("************************Before Sort**********");
		printString(string);
		insertionSort(string);
		System.out.println("***********************After sort***********");
		printString(string);
		
	}
}
