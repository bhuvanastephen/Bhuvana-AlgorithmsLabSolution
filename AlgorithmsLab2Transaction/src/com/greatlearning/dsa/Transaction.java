package com.greatlearning.dsa;

import java.util.Scanner;

public class Transaction {
	private static Scanner sc =new Scanner(System.in);


	public static void main(String[] args) {
		//Declaration
		int noOfTrn=0;
		int noOfTargets=0;
		int arr[]=null;
		int targetamount=0;
		int noOfTargetsToAchive=0;
		boolean targetAchieved=false;

		//User Input and Assignment
		System.out.println("Enter the size of transaction array ");
		noOfTrn= sc.nextInt();

		System.out.println("Enter the values of array ");
		arr=new int[noOfTrn];

		for (int i=0; i<noOfTrn ; i++) {
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved ");
		noOfTargets= sc.nextInt();

		//Iteration for number of targets
		while(noOfTargets>0) {
			targetAchieved=false;
			targetamount=0;
			System.out.println("Enter the value of target ");
			noOfTargetsToAchive= sc.nextInt();

			for(int i=0;i<noOfTrn; i++) {
				targetamount=targetamount + arr[i];
				if (targetamount >= noOfTargetsToAchive) {
					System.out.println(" Target achieved after " + (i + 1) + " transactions");
					targetAchieved=true;
					break;
				}
			}
			if (targetAchieved == false) {
				System.out.println(" Given target is not achieved ");
			}
			noOfTargets = noOfTargets-1;
		}
	}

}
