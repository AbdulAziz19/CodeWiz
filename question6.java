package entrance_test;

public class question6
{

	public static void main(String[] args)
	{
		long i,ctr=0;
		for(i=1;i>0;i++)
		{
			if(isprime(i))
			{
				ctr++;
			}
			if(ctr==10001)
			{
				System.out.println(i+" is the 10001st prime number");
				break;
			}
		}
				
	}
	public static boolean isprime(long n)
	{
		long ctr=0;
		for(long i=1;i<=n;i++)
		{
			if(n%i==0)
				ctr++;
		}
		if(ctr==2)
			return(true);
		else
			return false;
	}

}
