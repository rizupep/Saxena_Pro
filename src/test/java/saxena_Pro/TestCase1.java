package saxena_Pro;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import basepackage.BaseClass;

public class TestCase1 extends BaseClass
{

	@Test(priority=1,groups="Regression,sanity")
	public void verifyThePageLaunch()
	{
		driver.get("https://www.makemytrip.com");
	}
	
	@Test
	public void clickFlightButton()
	{
		
	}
	
	@Test
	public void user2ForGit()
	{
		
	}
}
