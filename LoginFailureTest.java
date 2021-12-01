import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFailureTest {
    @Test
    public void LoginFailureTest() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=eu");

        try {
            WebElement Logo = driver.findElement(By.id("logo"));
            System.out.println(" Se ha encontrado el Logo");
        }catch(Exception ex){
            System.out.println(" No se ha encontrado el Logo");
        }

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("test@test.com");

        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("123466");

        WebElement Login = driver.findElement(By.id("Login"));
        Login.click();

       WebElement error = driver.findElement(By.id("error"));
       System.out.println(error.getText());
       












    }
}
