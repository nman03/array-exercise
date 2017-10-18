/*
	Author: Neil Manimtim
*/

import java.util.Scanner;

public class ArrayExercise {
	
	public static void main(String[] args) {
		 
		 System.out.print("Enter ten numbers: ");
		 double[] arrayOfDoubles = createArray();
		 printArray(arrayOfDoubles);
		 squareRoot(arrayOfDoubles);
		 printArray(arrayOfDoubles);
		 replaceValue(arrayOfDoubles);
		 printArray(arrayOfDoubles);
		 double[] newArray = copyAndReplace(arrayOfDoubles);
		 printArray(arrayOfDoubles);
		 printArray(newArray); 
	
	}
	
	public static double[] createArray() {
		Scanner in = new Scanner(System.in);
		
		double[] array = new double[10];
		
		for (int count = 0 ; count < 10 ; count++) {
			array[count] = in.nextDouble();
		}
		
		return array;
	}
	
	public static void squareRoot(double[] array) {
		
		for (int count = 0 ; count < 10 ; count++) {
			System.out.print(Math.sqrt(array[count]) + " ");
		}
		
		System.out.println();
	}
	
	public static void replaceValue(double[] array) {
		
		for (int count = 0 ; count < 10 ; count++) {
			if (array[count] > 500) {
				array[count] = 500;
			}
		}
	}
	
	public static double[] copyAndReplace(double[] array) {
		
		double[] newArray = new double[array.length];
		
		for (int count = 0 ; count < array.length ; count++) {
			newArray[count] = 1 / array[count];
		}
		
		return newArray;
	}
	
	public static void printArray(double[] array) {
		
		for (int count = 0 ; count < 10 ; count++) {
			System.out.print(array[count] + " ");
		}
		
		System.out.println();	
	}
}
