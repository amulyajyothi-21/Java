class Disease
{
 public static void main(String aargs[])
 {
  int age=30;
  String disease="cold";
  if(age>80||disease=="Typhoid")
   System.out.println("Take Paracetmol");
  else
  {
   if(age>25)
     if(disease=="covid")
      System.out.println("Take vaccination");
   if(age<10)
    if(disease=="cold")
     System.out.println("Take Cough Syrup");
   if(age>10)
     if(disease=="cold")
     System.out.println("Take Tablet");
    
   }
  }
}
   