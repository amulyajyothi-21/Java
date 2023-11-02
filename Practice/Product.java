class Product
{
    public static void main(String[] args) 
    {
    String PName="ChocoCookie";
    String PCode="A1B22G3";
    int actualprice=5000;
    int sellingprice=900;
    int quantity=10;
    int totalcost=sellingprice*quantity;
    
    System.out.println("PName is"+ PName);
    System.out.println("PCode is " +PCode);
    System.out.println("actual price is" +actualprice);
    System.out.println("selling price is" +sellingprice);
    System.out.println("quantity is"+quantity);
    System.out.println("total cost is" +totalcost);
    if(totalcost>10000)
    {
     double disc=50.0/100*(totalcost);
     System.out.println("Discount for 50%  is"+disc);
     double totalpay=totalcost-disc;
     System.out.println("total payable is" +totalpay);
    }
   else if(totalcost>8000)
   {
    double disc=30.0/100*(totalcost);
    System.out.println("Discount for 30% is"+disc);
    double totalpay=totalcost-disc;
     System.out.println("total payable is" +totalpay);
   }
   else if(totalcost>2000)
   {
    double disc=10.0/100*(totalcost);
    System.out.println("Discount for 10% is"+disc);
    double totalpay=totalcost-disc;
     System.out.println("total payable is" +totalpay);
   }
  else if(totalcost>1000)
  {
   double disc=5.0/100*(totalcost);
    System.out.println("Discount for 5% is"+disc);
   double totalpay=totalcost-disc;
     System.out.println("total payable is" +totalpay);
  }  
        
 }
}