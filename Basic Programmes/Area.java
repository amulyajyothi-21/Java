

class Area
 {
    public static void main(String[] args) 
    {
        int r=5;
        int length=30;
        int breadth=15;
        int areaa=length*breadth;
        int perimeter=2*(length+breadth);
        double area=Math.PI*r*r;
        double cir=2*Math.PI*r;
        System.out.println("area of Rectangle is"+areaa);
        System.out.println("perimeter of Rectangle is "+perimeter);
        System.out.println("are of circle is"+area);
        System.out.println("circumferance of circle is"+cir);
        System.out.printf("circumferance of circle is %.2f",cir);
    }
}