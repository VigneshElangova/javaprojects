import java.util.*;
class NewFolder9
{
	static Scanner sc=new Scanner(System.in);
	public static void main (String[]args)
	{
		boolean xyz=true;
		do
		{
			System.out.println("\t\t\tWelcome To Calculator");
		}
		while (false);
		do
		{
		System.out.println("Select The Input\n1.Addition.\n2.Subtraction.\n3.Multiplication.\n4.Division.\n5.Exit.");
        int user=sc.nextInt();
		switch (user)
		{
		case 1:
			{
			System.out.println("\t\t\t Addition\n\n");
			System.out.println("Enter The First Value :");
			int a=sc.nextInt();
			System.out.println("Enter The Second Value :");
			int b=sc.nextInt();
			int c=a+b;
			System.out.println("Added value is :"+c);	
            break;
			}
	    case 2:
			{
			System.out.println("\t\t\t subtraction\n\n");
			System.out.println("Enter The First Value :");
			int a=sc.nextInt();
			System.out.println("Enter The Second Value :");
			int b=sc.nextInt();
			System.out.println("Added value is :"+(a-b));	
			break;
			}
        case 3:
			{
			System.out.println("\t\t\t Multiplication\\n");
			System.out.println("Enter The First Value :");
			int a=sc.nextInt();
			System.out.println("Enter The Second Value :");
			int b=sc.nextInt();
			System.out.println("Added value is :"+(a*b));	
			break;
			}
	    case 4:
			{
			System.out.println("\t\t\t Divide\\n");
			System.out.println("Enter The First Value :");
			int a=sc.nextInt();
			System.out.println("Enter The Second Value :");
			int b=sc.nextInt();
			System.out.println("Added value is :"+(a/b));
			break;
			}
	    case 5:
			{
			System.out.println("Thankyou For using Calculator");
			xyz=false;
			break;
			}
		default:
			{
			System.out.println("Invalid Input");
			break;
			}
		}
		}while(xyz);
		
	}
}