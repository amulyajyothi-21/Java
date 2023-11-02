class Hospital 
{
 public static void main(String args[])
 {
  String disease="Diarrhea";
  int age=65,sugar=300;
  
  switch(disease)
  {
   case "Diarrhea": if(age>0&&age<=15)
                    System.out.println("Have Medication at Home");
                   else if(age>=16&&age<=60)
                    System.out.println("Blood test to be taken and should get admitted in general ward");
                   else if(age>60)
                    System.out.println("To be admitted in ICU and Blood test and Full Body scan to be done");
                   break;
 
  case "Typhoid": if(age>0&&age<=15)
                   System.out.println("Need to visit hospital for regular checkups");
                   else if(age>=16&&age<=60)
                    System.out.println("Urine test to be taken and should get admitted in general ward");
                   else if(age>60)
                    System.out.println("To be admitted in ICU and Bone Marrow Test to be done");
                   break;

  case "Diabetes": 
                  System.out.println(" Urine Test and blood Test to be done to check the Sugar Levels ");
                  if(sugar>=300)
                  System.out.println("Should take Insulin");
                  else if(sugar<300)
                   System.out.println("Tablets to be taken"); 
                  break;
                  
                 
 default: System.out.println("Invalid Input");
  }
 }
}
