package tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
        driver.navigate().to("http://amazon.com");
        driver.navigate().back();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.close();

    }

}
