class Sum
{
 public static void main(String args[])
 {
  int start=1,sum=0;
  System.out.println("Forward Iteration");
  while(start<=10)
  {
   sum=sum+start;
   start++;
  }
  System.out.println(sum);
  System.out.println("=============================================");
  System.out.println("Backward Iteration");
  int number=10,Sum=0;
  while(number>=1)
  {
   Sum=Sum+number;
   number--;
  }
  System.out.println(Sum);
  
 }
}
   
   