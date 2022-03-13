package homeworkweek06;


public class Programme01 {

    //instance variables
    int a = 100;
    String name = "Jalpa";

    //instance method
    public void test1() {
        System.out.println(a);
        System.out.println(name);

    }

    //instance method always call in static method via object
    //static method
    public static void main(String[] args) {
        Programme01 obj = new Programme01();
      System.out.println(obj.a);
      obj.test1();



    }


}






