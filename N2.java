import java.util.Scanner;
class N2 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the A value :");
		int a=sc.nextInt();
		System.out.println("Enter the B value :");
		int b=sc.nextInt();
		System.out.println("Enter the C value :");
		int c=sc.nextInt();
		int res1=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("The Largest Number in this values is : \n"+res1);
		System.out.println("*************************");

	}
}
