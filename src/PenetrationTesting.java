import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PenetrationTesting {

    public static void main(String[] args) throws MalformedURLException {
        
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3a XL API 34"); // Android Emulator 
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14");
        dc.setCapability(MobileCapabilityType.APP, "/Users/riasengar/Downloads/accuweather-20-1-2-google.apk");
        
        // Set additional capabilities for penetration testing
        dc.setCapability("autoGrantPermissions", true); // Automatically grant app permissions
        dc.setCapability("noReset", true); // Do not reset app state between sessions
        
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, dc);
        
        driver.quit();
    }
}

