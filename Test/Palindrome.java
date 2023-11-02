class Palindrome
{ 
 public static void main(String args[])
 {
  int num=141,temp=num,square=0,rem=0,rev=0,product=0,rev1=0;
   for(;num!=0;num/=10)
   {
    rem=num%10;
    rev=rev*10+rem;
   }
  System.out.println(temp==rev?"Palindrome":"Not a palindrome");
}
}
 