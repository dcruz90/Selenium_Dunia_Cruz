import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FullRegistrationTest {

    @Test
    public void FulRegistrationTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("5555555");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");

        WebElement elementoMeses = driver.findElement(By.id("month"));
        Select meses = new Select(elementoMeses);
        meses.selectByVisibleText("Jun");

        WebElement elementoDias = driver.findElement(By.id("day"));
        Select dias = new Select(elementoDias);
        dias.selectByIndex(25);

        WebElement elementoanno = driver.findElement(By.id("year"));
        Select anno = new Select(elementoanno);
       anno.selectByValue("1980");

       driver.findElements(By.name("sex")).get(1).click();












    }
}
