class Marks
{
 public static void main(String args[])
 { 
  int a=55;
  int b=55;
  if(a>=65&&b<=45)
   System.out.println("Allowed to reappear for B exam to Qualify");
  else if(a<55&&b>=55)
  {
   if(a>=45)
    System.out.println("Qualified for a Degree");
 }  
 else if(a>=55&&b>=45)
   System.out.println("Qualified For a Degree");
  else
    System.out.println("Failed to Qualify");
 }
}

   
  
  