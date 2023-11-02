class Automatic
{
 public static void main(String args[])
 { 
   int num=76,quare=0,rem=0,rev=0,count=0;
   quare=num*num;
   int temp=quare;
   for(;temp!=0;temp/=10)
  {
     count++;
   rev=count%100;
  }
   System.out.println("Square value of "+num+ "is "+temp);
   System.out.println(rev);
   if(rev==num)
    System.out.println("Alien Number");
}
}