package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicProperty {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tutorialspoint.com/selenium/practice/dynamic-prop.php");

        driver.findElement(By.id("colorChange")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement element = driver.findElement(By.id("visibleAfter"));

        //Check if element appears or not
        if(element.isDisplayed()){
            System.out.println("Element is present");
        }
        else{
            System.out.println("Element is not present");
        }

        driver.quit();


    }

}
