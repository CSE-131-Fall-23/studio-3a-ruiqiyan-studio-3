package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Assign a number of numbers of your input: ");
		int numNum = scan.nextInt();
		System.out.println("Input " + numNum + " numbers:");
		int[] nums = new int[numNum];
		for (int k = 0; k < numNum; k++) {
			// nums[k] = scan.nextInt();
			double interm = Math.random() * 100;
			nums[k] = (int) interm;
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 2; j < nums[i]; j++) {
				if (nums[i]%j == 0) {
					// System.out.println(nums[i] + " is composite.");
					nums[i] = 0;
					break;
				}
			}
		}
		for (int m = 0; m < nums.length; m++) {
			if (nums[m] != 0) {
				System.out.print(nums[m] + " ");
			}
		}
		System.out.println("is/are prime/primes.");
	}

}
// 5 71 is/are prime/primes.