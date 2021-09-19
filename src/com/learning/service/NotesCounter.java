package com.learning.service;

public class NotesCounter {
	public void notesCounterImplementation(int[] arr, int amnt) {
		int counter[]=new int[arr.length];
		try {
			for(int i=0;i<arr.length;i++) {
				if(amnt>=arr[i]) {
					counter[i]=amnt/arr[i];
					amnt=amnt-counter[i]*arr[i];
				}
			}
			if(amnt>0) {
				System.out.println("Exact amount cannot be given with highest denominations");
			}
			else {
				System.out.println("Your payment approach in order to give min no of notes will be: ");
				for(int i=0;i<counter.length;i++) {
					if(counter[i]!=0){
						System.out.println(arr[i] + ":" + counter[i]);
					}
				}
			}
			
		}
		catch(ArithmeticException e) {
			System.out.println(e + " Notes of denomination 0 is invalid");
		}
	
	}

}
