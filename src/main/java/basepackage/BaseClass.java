package basepackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass{
	public ChromeDriver driver;

	@BeforeSuite
	public void OpenBrowser() {
		String OS = "Mac OS X";
		System.out.println();

		if (System.getProperty("os.name").equalsIgnoreCase(OS)) {
			System.out.println();
			// System.setProperty("webdriver.chromedriver", System.getProperty("user.dir") +
			// "/chromedriver");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver");
			driver = new ChromeDriver();
		}
	}
}
