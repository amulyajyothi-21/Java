class Ternary
{
 public static void main(String args[])
 {
  int a=30,b=20,c=10,d=5;
  int number=((a>b?(a>c?(a>d?a:d)a:c)):((b>c?(b>d?b:d):(c>d?c:d)));
  System.out.println(number+" is greater than and  "+a+ " and " +b+ " and " +c);
 }
} 
