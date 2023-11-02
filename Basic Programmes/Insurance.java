class Insurance
{
 public static void main(String args[])
 {
  int age=30;
  String area="city";
  String gender="Female",health="Excellent";
  if(health=="Excellent"&&age>=25&&age<=35&&area=="city"&&gender=="Male")
   System.out.println("Your Premium is Rs.4 per 1000 and policy amount cannot exceed Rs2 Lakh.");
 
  else if(health=="Excellent"&&age>=25&&age<=35&&area=="city"&&gender=="Female")
   System.out.println("Your Premium is Rs.3 per 1000 and  policy amonut cannot exceed Rs1 Lakh.");
 
  else if(health=="Poor"&&age>=25&&age<=35&&area=="village"&&gender=="Female")
   System.out.println("Your Premium is Rs.6 per 1000 and  policy amonut cannot exceed Rs10,000.");

  else 
   System.out.println("Cannot be Insured."); 
 }
}
