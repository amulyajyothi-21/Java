class Marks
{
 public static void main(String args[])
 { 
  int m1=100,m2=100,m3=95,m4=80,m5=100;
  int total=(m1+m2+m3+m4+m5);
  System.out.println(total);
  double aggregate=(total/500.0)*100.0;
  System.out.println("aggregate marks are "+aggregate);
  double percentage=(total/5.0);
  System.out.println("Total marks percentage is " +percentage+"%");
 }
}
