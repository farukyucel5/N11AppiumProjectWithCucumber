package util;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.time.Duration;

public class DriverFactory {

    public DriverFactory() {

    }

    public static AndroidDriver driver;

    public static void initializeTheN11Driver() {
        String platformName = ConfigReader.getProperty("platformName");
        if (platformName.equals("Android")) {
            UiAutomator2Options options=new UiAutomator2Options()
                    .setPlatformName(ConfigReader.getProperty("platformName"))
                    .setPlatformVersion(ConfigReader.getProperty("platformVersion"))
                    .setDeviceName(ConfigReader.getProperty("deviceName"))
                    .setAutomationName(ConfigReader.getProperty("automationName"))
                    .setAppPackage(ConfigReader.getProperty("n11Package"))
                    .setAppActivity(ConfigReader.getProperty("n11Activity"));

            driver = new AndroidDriver(options);
            int impWait = 15;
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(impWait));
        }
    }


    public static void closeDriver() {
        driver.quit();
    }
}