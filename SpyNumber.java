class SpyNumber
{
	public static void main(String[] args)
	{
		int num = 123;
		int temp = num;
		int sum = 0;
		int prod = 1;
		while(num!=0)
		{
			int digit = num%10;
			sum = sum + digit;
			prod = prod * digit;
			num = num/10;
		}
		if(sum == prod)
		{
			System.out.println(temp + " is a Spy number");
		}
		else
		{
			System.out.println(temp + " is not a Spy number");
		}
	}
}