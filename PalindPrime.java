class PalindPrime
{
	public static void main(String[] args) 
	{
		int primeCount=0;
		for (int i=1;i<=20 ;i++ )
		{
			int j=i;
			int rev=0;
			while (j!=0)
			{
				int rem=j%10;
				rev=rev*10+rem;
				j=j/10;
			}
			int rem1;
			if (rev==i)
			{
				while (rev!=0)
				{
					rem1=rev%10;
					int count=0;
				    for (int k=1;k<=rem1 ;k++ )
				    {
				    	if (rem1%k==0)
				    	{
				     		count++;
				    	}
				    }
				    if (count==2)
				    {
				    	primeCount++;
						System.out.println(rem1);
				    }
					rev=rev/10;
				}
			}
		}
		System.out.println("primecount : "+primeCount);
	}
}
