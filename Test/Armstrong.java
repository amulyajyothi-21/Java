class Armstrong
{
 public static void main(String args[])
{
 int num=371,temp=num,count=0,result=0,rem=0;
 for(;num!=0;num/=10)
 count++;
 num=temp;
 for(;num!=0;num/=10)
 {
  rem=num%10;
  result=result+(int)Math.pow(rem,count);
 }
if(temp==result)
System.out.println("Armstrong Number");
else
System.out.println("Not an Armstrong Number");
}
}