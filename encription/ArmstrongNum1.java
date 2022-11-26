class ArmstrongNum1
{
     public static void main(String[] args)
	 {
	    int num = 123;
		int t1 = num;
		int len = 0;
		
		while(t1 != 0)
		{
		   len = len+1;
		   t1 = t1/10;
		}
		System.out.println("Number length is: " + len);
		
		int t2 = num;
		int rem;
		int arm = 0;
		while(t2 != 0)
		{
		  int mul = 1;
		  rem = t2%10;
		  for(int i = 1; i<=len; i++)
		  {
		     mul = mul*rem;
		  }
		  arm = arm+mul;
		  t2 = t2/10;
		}
		
		if(arm == num)
		{
		 System.out.println("Number is armstrong");
		} else{
		 System.out.println("Number is not armstrong");
		}
	 }
}