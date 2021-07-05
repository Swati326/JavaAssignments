package JavaAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger 
	{
		public static void main(String x[])
		{
			int result=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Roman");
			String str=sc.nextLine();
			char ch[]=str.toCharArray();
			Map<Character, Integer> map=new HashMap<Character, Integer>();
			map.put('I',1);
			map.put('V',5);
			map.put('X',10);
			map.put('L',50);
			map.put('C',100);
			map.put('D',500);
			map.put('M', 1000);
			for(int i=0;i<ch.length;i++)
			{
				if(i>0 && map.get(ch[i]) > map.get(ch[i-1])) 
				{
					result=result -2* map.get(ch[i-1]);	
				}
				else
				{
					result=result + map.get(ch[i]);	
				}
			}
		System.out.print(result); 	
		}
	}
