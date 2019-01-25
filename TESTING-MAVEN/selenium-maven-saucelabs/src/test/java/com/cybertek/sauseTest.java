package com.cybertek;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class sauseTest {

	public static final String USERNAME = "CodeHunter";
	public static final String ACCESS_KEY = "91d30dee-c276-488a-b069-bcf990e4474a";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	@Test
	public void login() throws MalformedURLException {

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 7");
		caps.setCapability("version", "56.0");

		RemoteWebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://www.cnn.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
