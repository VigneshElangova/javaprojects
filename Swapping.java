class Swapping // Using Temp method 
{
	public static void main(String[] args) throws Exception
	{
		int a=20;
		int b=2;
        System.out.println("Before Swppping Method :");
		Thread.sleep(2000);
		System.out.println("A is "+a);
		Thread.sleep(1000);
		System.out.println("B is "+b);
		Thread.sleep(3000);
		//After swapping method
		int temp=a;
		a=b;
        b=temp;
	    System.out.println("After Swapping Method");
		Thread.sleep(2000);
		System.out.println("A is "+a);
		Thread.sleep(1000);
		System.out.println("b is "+b);
	}
}