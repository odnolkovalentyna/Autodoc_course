package lessons.lesson6;

public class StringMethods {
    public static void main(String[] args) {
        equelsIgnorCaseMethod();
        lastIndexOfMethod();
        valueOfMethod();
    }

    public static void valueOfMethod(){
        int num = 5657;
        String numstr = String.valueOf(num);
        System.out.println(numstr);
    }

    public static void lastIndexOfMethod(){
        String str = "Hello, my name is Alex";
        System.out.println(str.indexOf('l'));
        System.out.println(str.lastIndexOf('l'));
    }

    public static void equelsIgnorCaseMethod(){
        String str = "Hello, my name is Alex";

        if(str.equals("Hello, my name is ALEXX")){
            System.out.println("ok");
        } else {
            System.out.println("Fail");
        }
        if(str.equalsIgnoreCase("Hello, my name is ALEXX")){
            System.out.println("ok with ignore case");
        } else {
            System.out.println("Fail");
        }
    }
}
