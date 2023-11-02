class Steel
{
 public static void main(String args[])
 {
  int hardness=40;
  double carboncontent=0.5; 
  int tensilestrength=600;
  if(hardness>50&&carboncontent<0.7&&tensilestrength>5600)
   System.out.println("Grade is 10");
 else if(hardness>50&&carboncontent<0.7)
   System.out.println("Grade is 9");
 else if(carboncontent<0.7&&tensilestrength>5600)
   System.out.println("Grade is 8");
 else if(hardness>50&&tensilestrength>5600)
   System.out.println("Grade is 7");
 else if(hardness>50)
   System.out.println("Grade is 6");
 else
   System.out.println("Grade is 5");
 }
} 
  
  
  
  
  