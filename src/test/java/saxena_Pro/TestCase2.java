package saxena_Pro;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import basepackage.BaseClass;

public class TestCase2 extends BaseClass {
	
	@Test(priority = 1, groups = "Regression,sanity")
	public void verifyThePageLaunchtest2() {
		driver.get("https://www.makemytrip.com");
	}

	@Test
	public void clickFlightButtonTest2() {

	}
}
