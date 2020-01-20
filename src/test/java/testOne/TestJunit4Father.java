package testOne;

import org.junit.*;

public class TestJunit4Father {

    @BeforeClass
    public static void parentBeforeClassDemo(){
        System.out.println("test-parentBeforeClassDemo");
    }

    @AfterClass
    public static void parentAfterClassDemo(){
        System.out.println("test-parentAfterClassDemo");
    }

    @Before
    public void parentBeforeDemo(){
        System.out.println("test-parentBeforeDemo1");
    }

    @After
    public void parentAfterDemo(){
        System.out.println("test-parentAfterDemo1");
    }

}
