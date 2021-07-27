package JavaAssignment;

import java.util.*;

public class WaterTrap {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int Height = 0;
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Enter the height of bars");
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		if (A == null || A.length == 0) {
			System.out.println(0);
		}
		int left_side[]= new int[n];
		int right_side[]  = new int[n];
		
		//here initially the height is set to 0 here i used ternary operator to find height it compare with height of bar and according to 
		//condition it perform operation and we get left side array.here loop will start from 0 to n
		for (int start = 0; start < n; start++) 
		{
			left_side[start] = Height;
			Height=Height>A[start]?(Height):(A[start]);
		}
		//here initially the height is set to 0 here i used ternary operator to find height it compare with height of bar and according to 
		//condition it perform operation and we get right side array.here loop will start from n to 0
		Height = 0;
		for (int start= n - 1; start >= 0; start--) 
		{
			right_side[start] = Height;
			Height=Height>A[start]?(Height):(A[start]);
		}
		//to find the water contain in trap.here first we find the minimum value between left side array and right side array using ternary operator
		
		int total = 0;
		for (int start = 0; start < n; start++) 
		{
			int min=left_side[start]<right_side[start]?left_side[start]:right_side[start];
			int height = (min - A[start])>0?(min-A[start]):0;
			total = total + height;
		}
		System.out.println(" Water contain in "+total+" trap:");
	}
}
