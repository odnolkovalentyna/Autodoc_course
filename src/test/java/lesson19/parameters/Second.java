package lesson19.parameters;

import org.testng.annotations.Parameters;

public class Second {

    @Parameters({"user","password"})
    @org.testng.annotations.Test
    public void testFromSecondClass(String user, String password){
        System.out.println("first WindowHandles from second class. WindowHandles running in thread " +Thread.currentThread().getId());
        System.out.println(user);
        System.out.println(password);
    }

}
