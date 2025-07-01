package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tutorialspoint.com/selenium/practice/broken-links.php");

        driver.findElement(By.linkText("Click Here for Broken Link")).click();
        driver.navigate().back();

    }

}
