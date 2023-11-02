class Value
{
 public static void main(String args[])
 {
  char letter='g';
  if(letter>=(char)65&&letter<=(char)90)
  {
   System.out.println("capital");
   int alphabet=letter+32;
   char alpha=(char)alphabet;
   System.out.println(letter+" is converted to "+alpha);

  
  }
  else if(letter>=(char)97&&letter<=(char)122)
  {
   System.out.println("small");
   int alpha=letter-32;
   char alp=(char)alpha;
   System.out.println(letter+" is converted to "+alp);
  }

 }
}