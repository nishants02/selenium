package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Open website
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

        //Click Add button
        driver.findElement(By.cssSelector("button[data-bs-target='#staticBackdropLive']")).click(); //css selector
        Thread.sleep(2000);

        //Registration Form
        //First name
        driver.findElement(By.id("firstname")).sendKeys("Jack"); //name
        //Last name
        driver.findElement(By.id("lastname")).sendKeys("Sparrow"); //id
        //Email
        driver.findElement(By.id("email")).sendKeys("js@gmail.com"); //
        //Age
        driver.findElement(By.id("age")).sendKeys("0040");
        //Salary
        driver.findElement(By.id("salary")).sendKeys("This is salary textbox, entered text here");
        //Department
        driver.findElement(By.id("deparment")).sendKeys("asdfghjklzxcvbnm");


        //Login button click
        driver.findElement(By.cssSelector("input[class='btn btn-primary']")).click();


    }

}
