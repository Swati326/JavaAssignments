package JavaAssignment;

import java.util.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String x[]) {

		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roman");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		for (int i = 0; i < ch.length; i++) {
			int a = map.get(ch[i]);
			if (i + 1 < ch.length) {
				int b = map.get(ch[i + 1]);
				{
					if (a >= b) {
						result = result + a;
					} else {
						result = result - a;
					}
				}
			} else {
				result = result + a;
			}

		}
		System.out.print(result);
	}
}
