class Average
{
 public static void main(String args[])
 { 
   int  m1=50;
   int  m2=55;
   int  m3=60;
   int  m4=70;
   int totalmarks=(m1+m2+m3+m4);
   double average=totalmarks/4;
   System.out.println("total marks is"+totalmarks);
   System.out.println("avg is"+average);
   if(average>50)
   {
    System.out.println("pass");
   }
   else
   {
    System.out.println("fail");
   }
}
}