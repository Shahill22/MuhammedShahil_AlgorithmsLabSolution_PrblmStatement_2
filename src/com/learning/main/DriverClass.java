package com.learning.main;

import java.util.Scanner;

import com.learning.service.NotesCounter;
import com.learning.sort.MergeSort;

public class DriverClass {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of currency denominations:");
		size=sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter currency denominations values:");
		for(int i=0;i<size;i++){
			array[i]=sc.nextInt();	
		}
		MergeSort s = new MergeSort();
		s.sort(array,0,size-1);
		System.out.println("Enter the amount you want to pay: ");
		int amount = sc.nextInt();
		NotesCounter n = new NotesCounter();
		System.out.println();
		n.notesCounterImplementation(array, amount);
		sc.close();
	}

}
