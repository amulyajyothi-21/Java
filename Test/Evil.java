class Evil
{
public static void main(String args[])
{
 int num=9,temp=num,sum=0,result=0;
 double square=Math.pow(num,2);
 System.out.println(square);
 result=(int)Math.sqrt(square);
 for(;result!=0;result/=10)
{
 int rem=result%10;
 sum+=rem;
}
System.out.println(sum);
if(sum==num)
System.out.println("Evil Number");
else
System.out.println("Not an Evil number");

}
}