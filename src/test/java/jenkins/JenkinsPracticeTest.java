package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsPracticeTest {
	@Test
	public void genkinsPracticeTest() {
		Reporter.log("Hi jenkins",true);
		Reporter.log("Hi jenkins updated",true);
	}
}
