package entrance_test;
import java.util.*;
public class question4
{
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		int d,m,y;
		System.out.println("Enter Day");
		d=in.nextInt();
		System.out.println("Enter Month");
		m=in.nextInt();
		System.out.println("Enter Year");
		y=in.nextInt();
		if(isleap(y)==1)
		{
			if(m==1)
				d=d+0;
			else if(m==2)
				d=d+31;
			else if(m==3)
				d=d+60;
			else if(m==4)
				d=d+91;
			else if(m==5)
				d=d+121;
			else if(m==6)
				d=d+152;
			else if(m==7)
				d=d+182;
			else if(m==8)
				d=d+213;
			else if(m==9)
				d=d+244;
			else if(m==10)
				d=d+274;
			else if(m==11)
				d=d+305;
			else 
				d=d+335;
		}
		else
		{
			if(m==1)
				d=d+0;
			else if(m==2)
				d=d+31;
			else if(m==3)
				d=d+59;
			else if(m==4)
				d=d+90;
			else if(m==5)
				d=d+120;
			else if(m==6)
				d=d+151;
			else if(m==7)
				d=d+181;
			else if(m==8)
				d=d+212;
			else if(m==9)
				d=d+243;
			else if(m==10)
				d=d+273;
			else if(m==11)
				d=d+304;
			else 
				d=d+334;
		}
		System.out.println("Day Number: "+d);
		
		// TODO Auto-generated method stub

	}
	public static int isleap(int y)
	{
		if (((y% 4 == 0)&&(y%100!=0))||(y%4==0)) 
			return(1);
		else
			return(0);
	}

}
