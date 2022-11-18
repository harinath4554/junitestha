package junittesthapackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testaddnumber.class, testaddtwostrings.class })
public class AllTests {

}
