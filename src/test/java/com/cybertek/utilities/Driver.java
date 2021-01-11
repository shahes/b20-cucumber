package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {


    private static WebDriver driver;

    private Driver(){

    }

public static WebDriver getDriver() {

        String browser = ConfigurationReader.getProperty("browser");

       if(driver==null){
           switch(browser){
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver = new ChromeDriver();
                   break;
               case "firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driver = new FirefoxDriver();
                   break;

               case "remote-chrome":
                 //  ChromeOptions chromeOptions = new ChromeOptions();
                   DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                   desiredCapabilities.setBrowserName("chrome");

                   try {
                       URL gridUrl = new URL("http://54.226.168.134:4444/wd/hub");
                       driver = new RemoteWebDriver(gridUrl, desiredCapabilities);

                   } catch (MalformedURLException e) {
                       e.printStackTrace();
                   }
                   break;

               default :
                   throw new RuntimeException("No such a browser yet");

           }
       }




        return driver;
}
public static void closeDriver(){
        if(driver !=null){
            driver.quit();
        }
        driver=null;

}

}
