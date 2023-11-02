class Time
{
 public static void main(String args[])
 {
  int onehr=500;
  int onemin=60;
  int onesec=60;
  if(onehr>1000)
  {
   System.out.println("No of minutes in the given hrs are"+(onehr*onemin));
  }
 else
  {
   System.out.println("No of seconds in the given hrs are"+((onehr*onemin)*onesec));
  }
 }
}
   
  
  
