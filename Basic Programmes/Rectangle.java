class Rectangle
 {
    public static void main(String[] args) 
    {
        int length=4;
        int breadth=5;
        int area=length*breadth;
        int perimeter=2*(length+breadth);
        if(area>perimeter) 
         System.out.println("area is greater than Perimeter");
        else
         System.out.println("Perimeter is less than are"); 
        System.out.println("area of Rectangle is"+area);
        System.out.println("perimeter of Rectangle is "+perimeter);
        
     
    }
}