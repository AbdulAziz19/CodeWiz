package entrance_test;
import java.util.*;
public class question2
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int s,ctr_u=0,ctr_s=0;
		String u;
		for(int i=1;i<=3;i++)
		{
			System.out.println("ROUND "+i);		
			System.out.println("What do you chose Rock-R Paper-P Scissor-S");
			u=in.next();
			System.out.println("You chose "+u);
			s=(int)(1+Math.random()*3);
			//System.out.println(s);
			if(s==1)
				System.out.println("Computer chose R");
			else if(s==2)
				System.out.println("Computer chose p");
			else
				System.out.println("Computer chose S");
			if((u.equalsIgnoreCase("R")&& s==1)||(u.equalsIgnoreCase("P")&& s==2)||(u.equalsIgnoreCase("S")&& s==3))
				System.out.println("Round tied");
			if(u.equalsIgnoreCase("P")&& s==1)
			{
				System.out.println("You won this round");
				ctr_u++;
			}
			else if(u.equalsIgnoreCase("R")&& s==3)
			{
				System.out.println("You won this round");
				ctr_u++;
			}
			else if (u.equalsIgnoreCase("S")&& s==2)
			{
				System.out.println("You won this round");
				ctr_u++;
			}
			else if(u.equalsIgnoreCase("R")&& s==2)
			{
				System.out.println("You lost this round");
				ctr_s++;
			}			
			else if(u.equalsIgnoreCase("P")&& s==3)
			{
				System.out.println("You lost this round");
				ctr_s++;
			}		
			else if(u.equalsIgnoreCase("S")&& s==1)
			{
				System.out.println("You lost this round");
				ctr_s++;
			}			
		
		}
		if(ctr_u>ctr_s)
			System.out.println("Congrats you won the game");
		else if(ctr_s>ctr_u)
			System.out.println("Uh oh...you lost against a bot");
		else
			System.out.println("Match tied");

	}

}
