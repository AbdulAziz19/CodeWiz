	package entrance_test;

public class question3
{
	public static long check_CollatzSequence(long n)
	{
		long ctr=0,chain=0;
		while(n!=1)
		{
			if(n%2==0)
			{
				n=n/2;
				ctr++;
			
			}
			else
			{
				n=(3*n)+1;
				ctr++;
			}
			if(ctr>chain)
			{
				chain=ctr;
			}
			
		}
		
		return(chain);
	}
	public static void main(String[] args)
	{
		long i,maxchain=0,chain,num=0;
		for(i=2;i<1000000;i++)
		{
			chain=check_CollatzSequence(i);
			if(chain>maxchain)
			{
				maxchain=chain;
				num=i;
			}
		}
		System.out.println(num+" Has the largest sequence with chain length="+maxchain);

	}

}
