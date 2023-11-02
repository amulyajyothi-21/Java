class Salary
{
 public static void main(String args[])
 {
  int basicsalary=60000;
  double allowance=(40.0/100)*basicsalary;
  double rent=(20.0/100)*basicsalary;
  double gross=allowance+rent;
  int grosssalary=(int)gross;
  System.out.println(" Murali's basic salary is "+basicsalary);
  System.out.println(" Murali's allowance is "+allowance);
  System.out.println(" Murali's rent is "+rent);
  System.out.println(" Murali's gross salary is "+grosssalary);
 }
}