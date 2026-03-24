import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Selenium Automation");
        //new change
driver.quit();
        /*1 Open Chrome browser
2 Open Google website
3 Find search box
4 Type text automatically*/

    }
}