class PrimeOneToTen
{
 public static void main(String args[])
 {
  for(int x=1;x<=10;x++)
  {
   int start=2,count=0;
   for(;start<x;start++)
   {
    if(x%start==0)
    {
     count++;
     break;
    }
   }
  if(count==0&&x!=1)
   System.out.println(x);
 }
}
}
    