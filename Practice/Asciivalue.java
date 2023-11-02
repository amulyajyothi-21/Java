class Value
{
 public static void main(String args[])
 {
  char letter='A';
  int a=65,b=90,c=97,d=122;
  char var1=(char)a;
  char var2=(char)b;
  char var3=(char)c;
  char var4=(char)d;
  if(letter>=var1&&letter<=var2)
   System.out.println("Given Character is capital letter");
  else if(letter>=var3&&letter<=var4)
   System.out.println("Given Character is small letter");
  }
}