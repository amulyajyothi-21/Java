
import java.util.Scanner;
class user
{
int num;
public void method1()
{
 int count=0;
 for(int i=2;i<=num;i++)
 {
 if(num%2==0)
 {
  count++;
  break;
 }
}
if(count==0&&num!=0&&num!=1)
 System.out.println(num+" is a prime no");
else
 System.out.println(num+" is not a prime no");
 }
}
 class PrimeOrNot 
{
	public static void main(String[] args)
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter a number");
	  user obj=new user();
	  obj.num=s.nextInt();
	  obj.method1();
	  

	}

}
