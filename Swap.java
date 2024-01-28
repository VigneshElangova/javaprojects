class Swap 
{
	public static void main(String[] args) throws Exception
	{
		int a=5;
		int b=10;
        System.out.println("Before Swppping Method :");
		Thread.sleep(2000);
		System.out.println("A is "+a);
		Thread.sleep(1000);
		System.out.println("B is "+b);
		Thread.sleep(3000);
		//After swapping method
		a=a+b;
		b=a-b;
        a=a-b;
	    System.out.println("After Swapping Method");
		Thread.sleep(2000);
		System.out.println("A is "+a);
		Thread.sleep(1000);
		System.out.println("b is "+b);
	}
}







