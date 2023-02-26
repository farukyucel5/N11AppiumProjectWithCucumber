package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public DriverFactory() {

    }
    static AndroidDriver driver;
    static DesiredCapabilities desiredCapabilities;

    public static AndroidDriver initializeTheN11Driver() {
        String platformName = ConfigReader.getProperty("platformName");

        desiredCapabilities= new DesiredCapabilities();
        if (platformName.equals("Android")) {
            desiredCapabilities.setCapability("platformName", ConfigReader.getProperty("platformName"));
            desiredCapabilities.setCapability("platformVersion",ConfigReader.getProperty("platformVersionTablet"));
            desiredCapabilities.setCapability("deviceName",ConfigReader.getProperty("deviceNameTablet"));
            desiredCapabilities.setCapability("automationName",ConfigReader.getProperty("automationName"));
            desiredCapabilities.setCapability("appPackage",ConfigReader.getProperty("n11Package"));
            desiredCapabilities.setCapability("appActivity",ConfigReader.getProperty("n11Activity"));

            try {
                driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }


            int impWait = 15;
            driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);
        }


        return driver;
    }

    public static void closeDriver() {
        driver.closeApp();
    }
}