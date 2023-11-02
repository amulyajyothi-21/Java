class Bank
{
 public static void main(String[] args)
 {
  String BankName="SBI ANDHRA PRADESH";
  long AcctNo=12113450;
  String person="AMULYA";
  int amount=500000;
  int withdrawl=20000;
  int balance=amount-withdrawl;
  System.out.println("Bank Name is"+BankName);
  System.out.println("Account No is"+AcctNo);
  System.out.println("Person Name is "+person);
  System.out.println("Amount in the account is"+amount);
  System.out.println("Amount withdrawed is"+withdrawl);
  System.out.println("Total Balance in the account is"+balance); 
  if(balance>100000)
   System.out.println("you are Eligible for credit card");
 else if(balance>50000)
  System.out.println("Health Insurance can be approved");
 else if(balance>20000)
  System.out.println("LIC Insurance can be approved");
 else
  System.out.println("Not Eligible for any benifits");
  
 }
}