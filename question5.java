package entrance_test;

public class question5
{
	public static void main(String[] args)
	{
		int maxpal=0,maxnum1=0,maxnum2=0;
		for(int i=100;i<=999;i++)
		{
			for (int j=i; j<=999;j++)
			{
				int p=j*i;
				if(ispalindrome(p))
				{
					if(p>maxpal) 
					{
						maxpal=p;
						maxnum1=i;
						maxnum2=j;
					}
				}
			}
		}
		System.out.println(maxpal+" is the largest palindrome made from the product of "+maxnum1+" and "+maxnum2);
		
	}
	public static boolean ispalindrome(int a)
	{
		int num=a,rev=0,d;
		while(a!=0)
		{
			d=a%10;
			rev=(rev*10)+d;
			a=a/10;
		}
		if(rev==num)
			return(true);
		
		else 
			return(false);
	}

}
