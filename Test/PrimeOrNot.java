
import java.util.Scanner;
class user
{
int count,num,i;
  public void method1()
  {
   for(num=1;num<=10;num++)
   {
    count=0;
   for(i=2;i<num;i++)
   {
    if(num%i==0)
    {
     count++;
    }
   }
  if(count==0&&num!=1)
     System.out.println(num);
  }
  
}

 public void method2(int num)
 {
  for(;num<=10;num++)
  {
    count=0;
   for(int i=2;i<num;i++)
   {
    if(num%2==0)
    {
     count++;
    }
   }
  if(count==0&&num!=0&&num!=1)
    System.out.println(num);
  }
 }
}
public int count(int num)
 {
   count=0;
   for(int i=2;i<num;i++)
   {
    if(num%2==0)
    {
     count++;
    }
    return count;
   }
}
 public String model3(int num)
 {
  int count=count(num);
  if(count==0&&num!=1)
   return "Prime";
  else
   return "Not Prime";
 } 

}
 class PrimeOrNot 
{
	public static void main(String[] args)
	{
	  user obj=new user();
	  //obj.method1();
	  //obj.method2(obj.num);
           for(int x=1;x<=10;x++)
           {
            if(obj.model3(x).equlas("Prime"))
             System.out.println(num);

	}

}
