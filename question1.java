package entrance_test;
import java.util.*;
public class question1	
 {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a String");
			String s = in.nextLine();
			String n ="";
			int i,len = s.length();
			s = s.toUpperCase();
			for (i=len-len;i<len;i++)
			{
				char ch = s.charAt(i);
				if((ch=='G')||(ch=='C')||(ch=='T')||(ch=='A'))
				{
					if (ch=='G')
						n = n + 'C';
					if (ch=='C')
						n = n + 'G';
					if (ch=='T')	
						n = n + 'A';
					if (ch=='A')
						n = n + 'U';
				}
				else
				{
					System.out.println("Invalid Input");
					break;
				}
			}
			System.out.println(n);
		}
	}


