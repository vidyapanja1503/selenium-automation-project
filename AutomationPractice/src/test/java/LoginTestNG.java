import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestNG {
    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }
    @Test
    public void loginTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        String text = driver.findElement(By.className("title")).getText();

        // 🔥 ASSERT (important)
        Assert.assertEquals(text, "Products");
       // Assert.assertEquals("TestNG Working", "TestNG Working");

        driver.quit();
    }
}