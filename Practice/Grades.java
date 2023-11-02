class Marks
{
 public static void main(String args[])
 { 
  int m1=100,m2=90,m3=95,m4=40,m5=80,m6=100;
  int total=(m1+m2+m3+m4+m5+m6);
  System.out.println(total);
  if(total>550)
   System.out.println("A");
  else if(total>450)
   System.out.println("B");
  else if(total>350)
   System.out.println("C");
 else if(total>250)
   System.out.println("D");
 else 
   System.out.println("FAIL");
}
}