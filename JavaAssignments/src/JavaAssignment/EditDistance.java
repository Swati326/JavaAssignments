package JavaAssignment;

import java.util.Scanner;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first word");
		String string1=sc.nextLine();
		System.out.println("enter second word");
		String string2=sc.nextLine();
		int[][]d=new int[string1.length()+1][string2.length()+1];
		d[0][0]=0;
		for(int i=1;i<=string1.length();i++)
		{
			d[i][0]=i;
		}
		for(int j=1;j<=string2.length();j++)
		{
			d[j][0]=j;
		}
		for(int i=1;i<=string1.length();i++) 
		{	
		for(int j=1;j<=string2.length();j++)
		{
			if(string1.charAt(i-1)==string2.charAt(j-1))
			{
				d[i][j]=d[i-1][j-1];
			}
			else
			{
				d[i][j]=Math.min(Math.min(d[i-1][j],d[i][j-1]), d[i-1][j-1])+1;
			}	
		}
	}
    System.out.println(d[string1.length()][string2.length()]);
	}

}
