class Library
{
 public static void main(String args[])
 {
  String bookname="Famous Five";
  String bookid="A13DE";
  int totaldays=20;
  int freedays=4;
  int borroweddays=21;
  int remainingdays=totaldays-freedays;
  int days=remainingdays-borroweddays;
  System.out.println("Book Name is"+bookname);
  System.out.println("Book ID is"+bookid);
  if(borroweddays>=40)
   System.out.println("Membership cancelled");
  else if(borroweddays>=30)
   {
    int fine=days*5;
    System.out.println("Fine to be payed is "+fine+"RS");
      
   }
  else if(borroweddays>=10)
  {
    int fine=days*1;
    System.out.println("Fine to be payed is "+fine+"Rs");
  }
 else if(borroweddays>=5)
 {
   double fine=days*0.5;
   System.out.println("Fine be payed is "+fine+"RS");
  }
 }
}