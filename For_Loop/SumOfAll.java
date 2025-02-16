package forloops.sub.practice;

public class SumOfAll {

	public static void main(String[] args) {

		// Q1- print all the numbers between 10-100.
		// Q2- print all the odd numbers between 10-100.
		// Q3- print all the odd numbers between 10-100 which are greater than 50.
		// Q4- print sum of all the odd numbers which are greater than 50.

		int sum = 0;

		for (int i = 1; i <= 100; i++) { // Q1
			if (i % 2 == 1) { // Q2
				if (i > 50) { // Q3
					sum = sum + i; // Q4

				}
			}
		}
		System.out.println(sum);

	}
}
