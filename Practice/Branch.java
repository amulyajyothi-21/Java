class Branch
{
 public static void main(String args[])
 {
  String Branch="CSE";
  switch(Branch)
  {
   case "CSE": 
               int first=30000;
               System.out.println("First year is "+first);
               int second=40000;
               System.out.println("second year is "+second);
               int third=60000;
               System.out.println("Third year is "+third);
               int fourth=70000;
               System.out.println("Fourth year is "+fourth);
               double total=(first+second+third+fourth);
               System.out.println("Total fees for 4 years is"+total);
               break;
   case "ECE": 
               int firs=40000;
               System.out.println("First year is "+firs);
               int secon=50000;
               System.out.println("second year is "+secon);
               int thir=30000;
               System.out.println("Third year is "+thir);
               int fourt=60000;
               System.out.println("Fourth year is "+fourt);
               double tota=(firs+secon+thir+fourt);
               System.out.println("Total fees for 4 years is"+tota);
               break;
   case "EEE": 
               int fir=30000;
               System.out.println("First year is "+fir);
               int seco=40000;
               System.out.println("second year is "+seco);
               int thi=50000;
               System.out.println("Third year is "+thi);
               int four=60000;
               System.out.println("Fourth year is "+four);
               double tot=(fir+seco+thi+four);
               System.out.println("Total fees for 4 years is"+tot);
               break;
  default: System.out.println("Invalid Input");
  }
 }
}
               