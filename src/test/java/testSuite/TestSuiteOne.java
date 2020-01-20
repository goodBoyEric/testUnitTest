package testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testOne.TestJunit4Demo;
import testOne.TestJunit4DemoTwo;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestJunit4Demo.class,
        TestJunit4DemoTwo.class
})

public class TestSuiteOne {
}
