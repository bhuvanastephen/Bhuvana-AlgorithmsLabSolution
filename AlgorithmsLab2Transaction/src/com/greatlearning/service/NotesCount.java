package com.greatlearning.service;

public class NotesCount {

	public void NotesCountImplementation(int[] notes, int amount) {

		int AmountIn =amount;
		int n=0;
		String output="";

		try {
			for (int i=0;i<notes.length;i++) {
				n = AmountIn/notes[i];
				AmountIn = AmountIn - (n * notes[i]);
				output = output + notes[i] + ":" + n + "\n";
				if (AmountIn == 0) {
					break;
				}
			}

			//Output
			if (AmountIn == 0) {
				System.out.println("Your payment approach in order to give min no of notes will be");
				System.out.println(output);
			}
			else{
				System.out.println("Amount cannot be paid with the given denominations");
			}
		}catch(ArithmeticException ex) {
			System.out.println("Exception in calculation using the given denimination" + ex.getMessage());
		}
	}
}
