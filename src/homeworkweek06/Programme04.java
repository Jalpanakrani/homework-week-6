package homeworkweek06;

public class Programme04 {
    //4.1 Declare two instance and two static variables.
    int a = 50;
    int b = 70;
    static int c = 80;
    static String name = "jalpa";

    //4.2 Declare one instance method.
    //4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
    public static void test() {
        Programme04 obj = new Programme04();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(c);
        System.out.println(name);
    }

         public void test1(){

             System.out.println(a);
             System.out.println(b);
             System.out.println(c);
             System.out.println(name);


         }

        //4.5 Declare the Main method.
        //4.6 Call both instance and static methods into the Main method and run the programme.

          public static void main(String[]args){
             test();
             Programme04 obj2 = new Programme04();
             obj2.test1();


        }
}



