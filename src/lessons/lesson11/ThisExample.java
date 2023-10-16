package lessons.lesson11;

public class ThisExample {

    public static void main(String[] args) {
       
    }
    
    int num = 20;
    
    public void example(){
        int num = 10;
        System.out.println(this.num);
    }
}
