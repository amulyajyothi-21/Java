class Swap {
    public static void main(String[] args) 
    {
        int num1=10;
        int num2=20;
        int temp=0;
        System.out.println("Before Swapping");
        System.out.println(num1);
        System.out.println(num2);
        temp=num1*num2;//temp=200;
        num1=temp/num1;//num1=20;
        num2=temp/num2;//num2=10;
        System.out.println("After Swapping");
        System.out.println(num1);
        System.out.println(num2);
        
    }
}