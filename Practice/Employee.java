 class HelloWorld
{

     public static void main(String []args)
     {
        String ename="Amulya JYothi";
        int id=1;
        String edesignation="Web Developer";
        String edepartment="C.S.E";
        int totalworkingdays=30;
        int dayspresent=25;
        int daysabsent=5;
        int salarydaywise=1000;
        int actualsalary=totalworkingdays*salarydaywise;
        if(actualsalary>40000)
        {
         double discount=20.0/100*(actualsalary);
         System.out.println("Discount fo 20% is "+discount);
        }
        else if(actualsalary>15000)
        {
         double discount=15.0/100*(actualsalary);
         System.out.println("Discount fo 15% is "+discount);
        }
        else 
        {
         double discount=10.0/100*(actualsalary);
         System.out.println("Discount fo 10% is "+discount);
        }

        int salarycredited=dayspresent*salarydaywise;
        System.out.println("Employee Application");
        System.out.println("Employee name"+ename);
        System.out.println("Employee id"+id);
        System.out.println("Employee designation"+edesignation);
        System.out.println("Employee department" +edepartment);
        System.out.println("Employee total no.of working days"+totalworkingdays);
        System.out.println("Employee total no.of days present"+dayspresent);
        System.out.println("Employee total no.of days absent"+daysabsent);
        System.out.println("Salary_daywise"+salarydaywise);
        System.out.println("Salary Credited"+salarycredited);
 }
}