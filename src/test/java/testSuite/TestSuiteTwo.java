package testSuite;

import interfacePackage.InterfaceA;
import interfacePackage.InterfaceB;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testOne.TestJunit4Demo;
import testOne.TestJunit4DemoTwo;

@RunWith(Categories.class)
@Categories.IncludeCategory(InterfaceA.class)
@Categories.ExcludeCategory(InterfaceB.class)
@Suite.SuiteClasses({
        TestJunit4Demo.class,
        TestJunit4DemoTwo.class
})

public class TestSuiteTwo {

}
