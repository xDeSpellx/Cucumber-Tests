package Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
    WebDriver driver;
    private String firefoxDriver = "src/test/resources/Drivers/Firefox/geckodriver.exe";
    private String chromeDriver = "src/test/resources/Drivers/Chrome/chromedriver.exe";
    private String operaDriver = "src/test/resources/Drivers/Opera/operadriver.exe";
    private String edgeDriver = "src/test/resources/Drivers/Edge/msedgedriver.exe";
    private String edgeLegacyDriver = "src/test/resources/Drivers/EdgeLegacy/MicrosoftWebDriver.exe";

    public void openBrowser(String browserName) {
        switch (browserName) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", firefoxDriver);
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", chromeDriver);
                driver = new ChromeDriver();
                break;
            case "opera":
                System.setProperty("webdriver.opera.driver", operaDriver);
                driver = new OperaDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", edgeDriver);
                driver = new EdgeDriver();
                break;
            case "edgelegacy":
                System.setProperty("webdriver.edge.driver", edgeLegacyDriver);
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Please specify a valid browser. Possible choices are: firefox, chrome, opera, edge, edgelegacy");
        }
    }

    public void closeBrowser() {
        driver.quit();
    }

    public void navigate(String url){
        driver.navigate().to(url);
    }
}
