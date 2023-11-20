package lesson19.testSuitExample;

public class Second {

    @org.testng.annotations.Test
    public void testFromSecondClass(){
        System.out.println("first WindowHandles from second class. WindowHandles running in thread " +Thread.currentThread().getId());
    }

}
