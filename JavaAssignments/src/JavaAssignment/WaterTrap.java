package JavaAssignment;

import java.util.*;

public class WaterTrap {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int A[] = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		if (A == null || A.length == 0) {
			System.out.println(0);
		}
		n = A.length;
		int[] left = new int[n];
		int[] right = new int[n];
		int maxHeight = 0;
		for (int i = 0; i < n; i++) {
			left[i] = maxHeight;
			maxHeight = Math.max(maxHeight, A[i]);
		}
		maxHeight = 0;
		for (int i = n - 1; i >= 0; i--) {
			right[i] = maxHeight;
			maxHeight = Math.max(maxHeight, A[i]);
		}
		int total = 0;
		for (int i = 0; i < n; i++) {
			int height = Math.max(Math.min(left[i], right[i]) - A[i], 0);
			total = total + height;
		}
		System.out.println(total);
	}
}
