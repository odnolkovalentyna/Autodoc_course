package lesson18;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class FirstTestExample {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This method will execute before each Test method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This method will execute after each Test method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This method will execute before class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This method will execute before each Test before class");
    }

    @org.testng.annotations.Test(description = "this our first Test", priority = 1)
    public void testMethod(){
        System.out.println("Hello world");
    }
    @org.testng.annotations.Test(alwaysRun = true, dependsOnMethods = "testMethod", priority = 2, enabled = false) // отключен
    public void testMethod2(){
        System.out.println("Hello world 2");
    }
    @org.testng.annotations.Test(timeOut = 10000, priority = 3, invocationCount = 3) //таймаут будет указан при котором падает
    public void testMethod3(){
        System.out.println("Hello world 3");
    }
    @org.testng.annotations.Test(expectedExceptions = {ArithmeticException.class})
    public void testDivision(){
        System.out.println(2/0);
    }


}
