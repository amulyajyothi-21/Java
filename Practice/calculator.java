class Calculator
{
 public static void main(String args[])
 { 
  char symbol='/';
  int a=20;
  int b=10;
  switch(symbol)
  {
   case '+': System.out.println(a+b);
             break;
   case '-': System.out.println(a-b);
             break;
   case '*': System.out.println(a*b);
             break;
   case '/': System.out.println(a/b);
             break;
   case '%': System.out.println(a%b);
             break;
   default: System.out.println("Invalid Input");
  }
 }
}