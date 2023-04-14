package com.blz.datastrucure;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BubbleSort {
    static Scanner scanner=new Scanner(System.in);
    
    static public void bubbleSort(Integer[]array) {
    	for(int i=1;i<array.length;i++) {
    		int size=array.length;
    		
    		for(int j=0;j<size-1;j++) {
    			for(int k=0;j<size-j-1;k++) {
    				if(array[k].compareTo(array[k+1])>0) {
    					Integer temp=array[k];
    					array[k]=array[k+1];
    					array[k+1]=temp;
    				}
    			}
    		}
 
    	}
    }
       static public void printArray(Integer[] integer) {
    	   for(int i=0;i<integer.length;i++) {
    		   System.out.println("Integer at index"+i+"is"+integer[i]);
    	   }
       }
       static public void scanArray(Integer[]integers) {
    	   Scanner sc=new Scanner(System.in);
    	   for(int i=0;i<integers.length;i++) {
    		integers[i]=scanner.next();
    	   }
       }
       public static void main(String args[]) {
    	   Integer[]integer=new Integer[5];
    	   scanArray(integer);
    	   System.out.println("*************Before sorting*************************");
    	   printArray(integer);
    	   System.out.println("*************After sorting*************");
    	   bubbleSort(integer);
    	   printArray(integer);
       }
}
