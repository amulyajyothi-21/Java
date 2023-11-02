 class Alien
{
 public static void main(String args[])
 {
  int num=14,temp=num,square=0,rem=0,rev=0,product=0,rev1=0;
   square=num*num;
    System.out.println(num);
   System.out.println(square);
   for(;num!=0;num/=10)
   {
    rem=num%10;
    rev=rev*10+rem;
   }
  product=rev*rev;
  System.out.println(product);
  System.out.println(rev);
  for(;product!=0;product/=10)
  {
   int  rem1=product%10;
    rev1=rev1*10+rem1;
  }
System.out.println(rev1);
 if( square==rev1)
  System.out.print(temp+" is an alien number");  
else
 System.out.print(temp+" is not an alien number");
}
}
   