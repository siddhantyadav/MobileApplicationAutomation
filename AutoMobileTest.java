import static org.testng.Assert.assertNotNull;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import net.bytebuddy.asm.Advice.Thrown;

public class AutoMobileTest {

	AppiumDriver<WebElement> driver;

	@BeforeTest
	public void Setup() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		dc.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\siddh\\Downloads\\com.yelp.android-6.9.0-10004503-minAPI10.apk");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void CheckCoffeeOption() {

		// Assert.assertNotNull(driver.getContext());
		driver.findElement(By.id("com.yelp.android:id/splash_button_bottom")).click();
		driver.findElement(By.id("com.yelp.android:id/activity_login_editUsername")).sendKeys("testappium2@gmail.com");
		driver.findElement(By.id("com.yelp.android:id/activity_login_editPassword")).sendKeys("appiumtest2");
		driver.findElement(By.id("com.yelp.android:id/activity_login_btnLogin")).click();

		WebElement aAlertButton = driver.findElement(By.id("android:id/button1"));

		if (aAlertButton.isDisplayed())
			aAlertButton.click();

		driver.findElement(By.id("com.yelp.android:id/nearby")).click();
		assertNotNull(driver.findElement(By.xpath("//android.widget.TextView[@text='Coffee & Tea']")));

		driver.closeApp();
	}
	@Test
	public void CheckRestaurantsOption() {

		// Assert.assertNotNull(driver.getContext());
		driver.findElement(By.id("com.yelp.android:id/splash_button_bottom")).click();
		driver.findElement(By.id("com.yelp.android:id/activity_login_editUsername")).sendKeys("testappium2@gmail.com");
		driver.findElement(By.id("com.yelp.android:id/activity_login_editPassword")).sendKeys("appiumtest2");
		driver.findElement(By.id("com.yelp.android:id/activity_login_btnLogin")).click();

		WebElement aAlertButton = driver.findElement(By.id("android:id/button1"));

		if (aAlertButton.isDisplayed())
			aAlertButton.click();

		driver.findElement(By.id("com.yelp.android:id/nearby")).click();
		assertNotNull(driver.findElement(By.xpath("//android.widget.TextView[@text='Restaurants']")));

		driver.closeApp();
	}
	@Test
	public void CheckBarsOption() {

		// Assert.assertNotNull(driver.getContext());
		driver.findElement(By.id("com.yelp.android:id/splash_button_bottom")).click();
		driver.findElement(By.id("com.yelp.android:id/activity_login_editUsername")).sendKeys("testappium2@gmail.com");
		driver.findElement(By.id("com.yelp.android:id/activity_login_editPassword")).sendKeys("appiumtest2");
		driver.findElement(By.id("com.yelp.android:id/activity_login_btnLogin")).click();

		WebElement aAlertButton = driver.findElement(By.id("android:id/button1"));

		if (aAlertButton.isDisplayed())
			aAlertButton.click();

		driver.findElement(By.id("com.yelp.android:id/nearby")).click();
		assertNotNull(driver.findElement(By.xpath("//android.widget.TextView[@text='Bars']")));

		driver.closeApp();
	}
	@Test
	public void CheckDeliveryOption() {

		// Assert.assertNotNull(driver.getContext());
		driver.findElement(By.id("com.yelp.android:id/splash_button_bottom")).click();
		driver.findElement(By.id("com.yelp.android:id/activity_login_editUsername")).sendKeys("testappium2@gmail.com");
		driver.findElement(By.id("com.yelp.android:id/activity_login_editPassword")).sendKeys("appiumtest2");
		driver.findElement(By.id("com.yelp.android:id/activity_login_btnLogin")).click();

		WebElement aAlertButton = driver.findElement(By.id("android:id/button1"));

		if (aAlertButton.isDisplayed())
			aAlertButton.click();

		driver.findElement(By.id("com.yelp.android:id/nearby")).click();
		assertNotNull(driver.findElement(By.xpath("//android.widget.TextView[@text='Delivery']")));

		driver.closeApp();
	}
	

	@AfterTest
	public void CloseAll() {
		driver.closeApp();
	}

}
