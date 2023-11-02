class Swap
{
 public static void main(String args[])
 {
  int num1=300,num2=200,num3=100;
  int temp;
  if(num1>num2)
  {
   temp=num1;
   num1=num2;
   num2=temp;
   
  }
  if(num1>num3)
  {
   temp=num1;
   num1=num3;
   num3=temp;
   
  }
 if(num2>num3)
  {
   temp=num2;
   num2=num3;
   num3=temp;
   
  }
   System.out.println("num1 value is"+num1);
   System.out.println("num2 value is"+num2); 
   System.out.println("num3 value is"+num3);  
}
}

  
   
   
   