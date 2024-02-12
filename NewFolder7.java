import java.util.*;
class NewFolder7
{
  static Scanner Sc=new Scanner(System.in);
  public static void main(String[]args)
	{
	System.out.println("Enter The First Value A is:");
	int a=Sc.nextInt();	
	System.out.println("Enter The Second Value B is:");
	int b=Sc.nextInt();	
    System.out.println("*****************************");
	if (b==a)
	{
		System.out.println("Same Input/No Output");
	}
	else if (a<b)
	{
		System.out.println("*First Value Should be Greater Than the Second Value*");
	}
	a=a-1;
	while (a>b)//a greater than or b
	{
	if (a%2==0)
	{
		System.out.println(a);
	}
	a--;
	}
	
	}
	
}