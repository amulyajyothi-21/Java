import java.util.Scanner;
class use
{
 int num,rev=0;
    public void method1()
    {
     int temp=num;
     for(;num!=0;num/=10)
     {
      int rem=num%10;
      rev=rev*10+rem;
     }
     System.out.println(rev);
    }
   
    public void method2(int num)
     {
      int temp=num;
      for(;num!=0;num/=10)
      {
       int rem=num%10;
       rev=rev*10+rem;
      }
     System.out.println(rev);
    }

    public int method3(int num)
    {
     int temp=num;
     for(;num!=0;num/=10)
     {
      int rem=num%10;
      rev=rev*10+rem;
     }
     return rev;
    }
    
  }
class Reverse
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a Number");
  use obj=new use();
  obj.num=sc.nextInt();
  obj.method1();
  obj.method2(obj.num);
  System.out.println(obj.method3(obj.num));
  
 }
}
  