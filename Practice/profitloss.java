class Product
{
  public static void main(String[] args) 
  {
    String PName="ChocoCookie";
    String PCode="A1B22G3";
    int actualprice=5000;
    int sellingprice=25500;
    if(actualprice>sellingprice)
    {
     int loss=actualprice-sellingprice;
     System.out.println("Total loss is"+loss);
    }
    else if(actualprice<sellingprice)
    {
     int profit=sellingprice-actualprice;
     System.out.println("Total Profit is"+profit);
    }
  }
}
