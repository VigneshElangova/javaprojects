class Otp 
{
	public static void main(String[] args)throws Exception 
	{
		System.out.println("Enter the OTP : ");
        int otp=(int)(Math.random()*9999+9999);
		Thread.sleep(2000);
        System.out.println(otp);
	}
}
