package testOne;

import interfacePackage.InterfaceA;
import org.junit.*;
import org.junit.experimental.categories.Category;

@Category(InterfaceA.class)
public class TestJunit4DemoTwo extends TestJunit4Father {

    @BeforeClass
    public static void beforeClassDemoTwo(){
        System.out.println("test-beforeClassDemoTwo");
    }

    @AfterClass
    public static void afterClassDemoTwo(){
        System.out.println("test-afterClassDemoTwo");
    }

    @Before
    public void beforeDemoTwo(){
        System.out.println("test-beforeDemoTwo");
    }

    @After
    public void afterDemoTwo(){
        System.out.println("test-afterDemoTwo");
    }

    @Test
    public void testB1(){
        System.out.println("test--testB1");
    }

    @Test
    public void testB2(){
        System.out.println("test-testB2");
    }

}
