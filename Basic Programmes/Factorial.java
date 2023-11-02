class Factorial
{
 public static void main(String args[])
 {
  System.out.println("Forward Iteration of Factorial");
  int n=1,product=1,number=10;
  while(n<=10)
  {
   product=product*n;
   n++;
  }
 System.out.println("Factorial of "+number+" is "+product);
 System.out.println("========================================");
 System.out.println("Backward Iteration of Factorial");
  int num=10,Product=1,numb=10;
  while(num>=1)
  {
   Product=Product*num;
   num--;
  }
 System.out.println("Factorial of "+numb+" is "+Product);
 }
 
}