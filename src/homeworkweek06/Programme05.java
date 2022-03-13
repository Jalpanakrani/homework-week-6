package homeworkweek06;

public class Programme05 {
    //main method
    public static void main(String[] args) {
        addition(10,20,30,40);//calling static addition method by giving volue in main method
        subtraction(40,10);//calling static substraction method by giving value to variable in main method
        Programme05 obj1= new Programme05();
        obj1.division (40,20);//calling instance method by giving value to variable in main method
        obj1.multiplication(10,20,30,40);

    }

    //static method
    public static void addition (int a , int b, int c, int d){
        System.out.println(a+b+c+d);}
    //static method
    public static void subtraction ( int d , int a ) {
        System.out.println(d - a);
    }
        //instance method
    public void multiplication( int a, int b, int c, int d )
    {

        System.out.println(a * b * c * d);
    }
        //instance method
    public void division (int d, int b){

    System.out.println(d/b);
    }
    }





