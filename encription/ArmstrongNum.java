class ArmstrongNum
{
         public static void main(String[] args)
		 {
			 int num = 153;
			 int len = 0;
			 int temp1 = num;
			 
			 while(temp1 != 0)
			 {
			   len = len+1;
			   temp1 = temp1/10;
			 }
			 
			 int temp2 = num;
			 int rem;
			 int arm = 0;
			 
			 while(temp2 != 0)
			 {
			    int mul = 1;
			    rem = temp2%10;
				for(int i=1; i<=len; i++)
				{
				    mul = mul*rem;
				}
				arm = arm+mul;
				temp2 = temp2/10;
			 }
			 if(arm == num)
			 {
			  System.out.println("Number is armstrong");
			 } else{
			  System.out.println("Number is not armstrong");
			 }
		 }
}