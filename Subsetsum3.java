package midterm;

import java.util.Scanner;

public class Subsetsum3 {
	public static boolean subsetsum3(int[] input) {
		for(int i = 1; i < input.length - 1; i++) {
			for (int j = 0; j < i; j++) {
				for(int k = i + 1; k < input.length; k++) {
					if(input[k] == input[i] - input[j])
						return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[6];
		for (int i = 0; i < 6; i++) {
			a[i] = input.nextInt();
		}
		System.out.println(subsetsum3(a));
		input.close();
		System.exit(0);
	}
}
