import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SpotifyWithCssSelectorTest {
    @Test
    public void spotifyByPlaceHolderTest() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spotify.com/uy/signup/");

        driver.findElement(By.cssSelector("input[placeholder='Introduce tu correo electrónico.']")).sendKeys("albertoperez@bbb.com");
        driver.findElement(By.cssSelector("input[placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("albertoperez@bbb.com");
        driver.findElement(By.cssSelector("input[placeholder='Crea una contraseña.']")).sendKeys("AAAAPPPP123");
        driver.findElement(By.cssSelector("input[placeholder='Introduce un nombre de perfil.']")).sendKeys("Alberto Perez");
        driver.findElement(By.cssSelector("input[placeholder='DD']")).sendKeys("10");

        WebElement elementoMes = driver.findElement(By.id("month"));
        Select mes = new Select(elementoMes);
        mes.selectByVisibleText("Febrero");

        driver.findElement(By.cssSelector("input[placeholder='AAAA']")).sendKeys("1990");

        driver.findElement(By.cssSelector("label[for='gender_option_female']")).click();


        driver.findElement(By.cssSelector("label[for='marketing-opt-checkbox']")).click();
        driver.findElement(By.cssSelector("label[for='third-party-checkbox']")).click();

    }
}
