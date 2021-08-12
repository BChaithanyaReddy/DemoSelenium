package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Circbuzz {
    @Test
    public void firstVisit() {


        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cricbuzz.com/");
        String baseTitle = driver.getTitle();
        System.out.println("title =" + baseTitle);
        driver.manage().window().maximize();
    }
}
