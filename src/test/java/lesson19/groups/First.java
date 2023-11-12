package lesson19.groups;

public class First {

    @org.testng.annotations.Test(groups = "our-group")
    public void testFromFirstClass(){
        System.out.println("first Test from first class. Test running in thread " +Thread.currentThread().getId());
    }
    @org.testng.annotations.Test
    public void secondTestFromFirstClass(){
        System.out.println("second Test from first class. Test running in thread " +Thread.currentThread().getId());
    }
}
