import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        // Enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click login button
        driver.findElement(By.id("login-button")).click();
        String tittle =driver.getTitle();
        if(tittle.contains("Swag Labs")){
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login Failed");
        }

        //Verify product page
        //After login, check:
        /*String pageSource = driver.getPageSource();
                if(pageSource.contains("Products")){
                    System.out.println("Products page displayed");
                }
                else {
                    System.out.println("Products page NOT displayed");
                }*/
        String text = driver.findElement(By.className("title")).getText();

        if(text.equals("Products")) {
            System.out.println("Correct page");
        }
driver.quit();
    }
}