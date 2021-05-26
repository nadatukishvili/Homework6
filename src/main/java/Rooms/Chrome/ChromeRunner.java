package Rooms.Chrome;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.sleep;

public class ChromeRunner {
    @BeforeTest
    public void openBrowser(){
        com.codeborne.selenide.Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "File/chromedriver.exe");
        Configuration.startMaximized = true;
        Selenide.open( "https://roomshotels.com/");
        sleep(5000);

   }
}
