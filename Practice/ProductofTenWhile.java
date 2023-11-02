class Product
{
 public static void main(String args[])
 {
  int start=1,Product=1;
  System.out.println("Forward Iteration");
  while(start<=10)
  {
   Product=Product*start;
   start++;
  }
  System.out.println("Product 1 to 10 is "+Product);
  System.out.println("=============================================");
  System.out.println("Backward Iteration");
  int number=10,product=1;
  while(number>=1)
  {
   product=product*number;
   number--;
  }
  System.out.println("Product 1 to 10 is "+product);
  
 }
}
   
   