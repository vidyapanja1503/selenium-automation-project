import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

@Test
public void LoginTest(){

    WebDriver driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com");

    LoginPage page = new LoginPage(driver);
    page.login("standard_user", "secret_sauce");

    String title = driver.findElement(By.className("title")).getText();

    Assert.assertEquals(title, "Products");

    driver.quit();
}