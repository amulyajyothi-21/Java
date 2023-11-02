class Letter
{
 public static void main(String args[])
 {
  char letter='0';
  if(letter>=(char)65&&letter<=(char)90)
   System.out.println("Given Character is capital letter");
  else if(letter>=(char)97&&letter<=(char)122)
   System.out.println("Given Character is small letter");
  else if(letter>=(char)48&&letter<=(char)57)
   System.out.println("Given Character is Digit");
  else  
   System.out.println("Given Character is Symbol");
  }
}