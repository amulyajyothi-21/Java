class Prime
{
 public static void main(String args[])
 {
  int num=11,start=2,count=0;
  for(;start<num;start++)
  {
   if(num%start==0)
   {
    count++;
    break;
   }
 }
if(count==0&&num!=1)
  System.out.println(num+" is a Prime number");

}
}