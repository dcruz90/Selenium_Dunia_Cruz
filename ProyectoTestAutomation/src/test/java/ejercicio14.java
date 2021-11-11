import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ejercicio14 {

    @Test
    public void Netflix() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/uy/");

        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(" ***** " + h1.getText());

        WebElement h2 = driver.findElement(By.tagName("h2"));
        System.out.println(" ***** " + h2.getText());
        driver.navigate().refresh();

        List<WebElement> divList = driver.findElements(By.tagName("div"));

        System.out.println(" La cantidad de div es: " + divList.size());

        List<WebElement> aList = driver.findElements(By.tagName("a"));

        System.out.println(" La cantidad de link es: " + aList.size());

        String title = driver.getTitle();
        System.out.println(" El titulo de la pagina es: " + title);

        List<WebElement> buttonList = driver.findElements(By.tagName("button"));

        for (int i = 0; i<buttonList.size();i++){
            System.out.println(buttonList.get(i).getText());

        }
    }

}
