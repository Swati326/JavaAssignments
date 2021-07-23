package JavaAssignment;

import java.util.*;

public class MergeSortedMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i,j,temp;
		double a[]=new double[10];
		Scanner sc=new Scanner(System.in);
		//took two arrays for find the median.here array type is double because the median can be float
		System.out.println("enter size of 1st array");
		double n=sc.nextDouble();
		System.out.println("enter size of 2nd array");
		double n1=sc.nextDouble();
		System.out.println("enter 1st array");
		for(i=0;i<n;i++)
		{
			a[(int) i]=sc.nextDouble();
		}
		int b[]=new int[10];
		System.out.println("enter 2nd array");
		for(i=0;i<n1;i++)
		{
			b[(int) i]=sc.nextInt();
		}
		//merge array 
		double m[]=new double[(int) (n+n1)];
		System.out.println("After Merging");
		j=0;
		for(i=0;i<n;i++)
		{
			m[(int) j]=a[(int) i];
			j++;
		}
		for(i=0;i<n1;i++)
		{
			m[(int) j]=b[(int) i];
			j++;
		}
		for(j=0;j<n+n1;j++)
		{
			System.out.println(m[(int) j]);
		}
		//sorted array to find median
		System.out.println("Ascending order");
		for(i=0;i<n+n1;i++)
		{
		for(j=i+1;j<n+n1;j++)
		{
			if(m[(int) i]>m[(int) j])
			{
			temp=m[(int) i];
			m[(int) i]=m[(int) j];
			m[(int) j]=temp;
		    }
		}
		System.out.println(m[(int) i]);
		}
		//to find the median.. first we need to know how many integer consist in array
		//if size of array or total no.of integer present in array is odd then we can get result directly as median=n+1/2.
		//here n means total no of integer present in array
		//and if size of array or total no.of integer present in array is Even then we need need find middle two integer.
		//then add this two integer and divide it by 2 to find appropriate median.
		double median;
		if(m.length%2!=0)
		{
			median=(m.length+1)/2;
		}
		else
		{
			int v=(m.length/2)-1;
			int u=(m.length/2);	
		
			median=(m[v]+m[u])/2;
		}
		System.out.println("median is:"+median);//display the output
	}
	
	}

