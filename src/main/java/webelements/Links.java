package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");


        driver.findElement(By.linkText("Home")).click();

        driver.switchTo().window("Selenium Practice - Links");

        driver.findElement(By.linkText("Moved")).click();




    }


}
