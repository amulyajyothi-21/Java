class Nested
{
 public static void main(String args[])
 {
  int age=110;
 if(age>=18)
  {
   if(age>=50)
   {
    if(age>=110)
      System.out.println("Super Senior Citizen");
    else
      System.out.println("Senior Citizen");
   }
  else
   System.out.println("Major");
  }
  else
  {
   if(age<10)
    System.out.println("Kids");
   else
    System.out.println("Minor");
  }
 }
}
 