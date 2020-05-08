package TestNG;

import org.testng.annotations.Test;

public class GroupExecution2 {

    @Test(groups = "regression")
    void Test1()
    {
        System.out.println("This is Test A");
    }

    @Test(groups = "regression")

    void Test2()
    {
        System.out.println("This is Test B");
    }

    @Test(groups = "Sanity")
    void Test3()
    {
        System.out.println("This is Test C");
    }

    @Test(groups = {"Sanity"})
    void Test4()
    {
        System.out.println("This is Test D");
    }

    @Test(groups = {"regression", "Sanity"})
    void Test5()
    {
        System.out.println("This is Test E");
    }
}
