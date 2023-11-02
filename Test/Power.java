class Power
{
 public static void main(String args[])
 { 
  int num=132,sum=0,rem=0,temp=num,product=1;
  for(;num!=0;num/=10)
  {
   rem=num%10;
   sum+=rem;
   product*=rem;
  }
  /*System.out.println(sum);
  System.out.println(product)*/
if(sum==product)
 System.out.println(temp+" is a power number");
  
}
}