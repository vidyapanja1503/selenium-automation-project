import com.sun.jdi.PathSearchingVirtualMachine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.time.Duration;

public class LoginTest2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));

        String text = driver.findElement(By.className("title")).getText();

        if (text.equals("Products")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
// Wait for product page
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_item")));

// Click "Add to Cart" button
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        String cartItem = driver.findElement(By.className("inventory_item_name")).getText();

        if(cartItem.contains("Backpack")) {
            System.out.println("Product added successfully");
        } else {
            System.out.println("Product not added");
        }
        //driver.quit();
    }
}
