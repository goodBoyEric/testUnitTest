package testOne;

import interfacePackage.InterfaceA;
import interfacePackage.InterfaceB;
import org.junit.*;
import org.junit.experimental.categories.Category;


public class TestJunit4Demo extends TestJunit4Father {

    @BeforeClass
    public static void beforeClassDemo(){
        System.out.println("test-beforeClassDemo");
    }

    @AfterClass
    public static void afterClassDemo(){
        System.out.println("test-afterClassDemo");
    }

    @Before
    public void beforeDemo(){
        System.out.println("test-beforeDemo");
    }

    @After
    public void afterDemo(){
        System.out.println("test-afterDemo");
    }

    @Category({InterfaceA.class,InterfaceB.class})
    @Test
    public void testA1(){
        System.out.println("test--First");
    }

    @Category(InterfaceB.class)
    @Test
    public void testA2(){
        System.out.println("test-Second");
    }

}
