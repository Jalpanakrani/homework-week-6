package homeworkweek06;

public class Programme03 {
          //instance variable
            int a = 100;
            //static variables
            static String name = "Jalpa";

    //static method
    public static void test(){
        Programme03 obj = new Programme03();
        System.out.println(obj.a);// variable print statement
        System.out.println(name);
    }

    //instance method
    public void test1(){
        Programme03 obj =new Programme03();
        System.out.println(obj.a);// variable print statement
        System.out.println(name);

    }

    public static void main(String[] args) {
        test();Programme03 obj=new Programme03();
        obj.test1();


    }
}
