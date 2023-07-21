package util;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.time.Duration;

public class DriverFactory {

    public DriverFactory() {

    }

    public static AndroidDriver driver;
    static DesiredCapabilities desiredCapabilities;

    public static void initializeTheN11Driver() {
        String platformName = ConfigReader.getProperty("platformName");

        UiAutomator2Options options=new UiAutomator2Options();

        if (platformName.equals("Android")) {
            options.setPlatformName(ConfigReader.getProperty("platformName"));
            options.setPlatformVersion(ConfigReader.getProperty("platformVersion"));
            options.setDeviceName(ConfigReader.getProperty("deviceName"));
            options.setAutomationName(ConfigReader.getProperty("automationName"));
            options.setAppPackage(ConfigReader.getProperty("n11Package"));
            options.setAppActivity(ConfigReader.getProperty("n11Activity"));

            driver = new AndroidDriver(options);
            int impWait = 15;
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(impWait));
        }
    }


    public static void closeDriver() {
        driver.quit();
    }
}