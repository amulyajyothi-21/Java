class Swap {
    public static void main(String[] args) 
    {
        int c=10;
        int d=20;
        System.out.println("Before Swapping");

        System.out.println(c);
        System.out.println(d);
        c=c+d;//c=30;
        d=c-d;//d=10;
        c=c-d;//c=20;
        System.out.println("After Swapping");
        System.out.println(c);
        System.out.println(d);
        
    }
}