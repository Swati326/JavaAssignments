package JavaAssignment;
public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,count=0,temp;
		String s1="horse";
		String s2="ros";
		char ch[]=s1.toCharArray();
		char ch1[]=s2.toCharArray();
		//replace 'h' with 'r'
		temp=ch[0];
		ch[0]=ch1[0];	
		count++;
		//remove 'r'
		for(i=0;i<ch.length;i++)
		{
			ch[2]=ch[3];
		}
		count++;
		//remove 'e'
		for(i=0;i<ch.length-2;i++)
		{
			System.out.print(ch[i]);
		}
		count++;
		System.out.println("\ncount is:"+count);
		}
	}