package lesson19.groups;

public class Second {

    @org.testng.annotations.Test
    public void testFromSecondClass(){
        System.out.println("first Test from second class. Test running in thread " +Thread.currentThread().getId());
    }

}
