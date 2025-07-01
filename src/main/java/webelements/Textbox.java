package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Open website in browser
        driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");

        //Click on Elements
        driver.findElement(By.id("headingOne")).click();

        //Click on Check Xox
//        driver.findElement(By.xpath("//a[@href='check-box.php']")).click();


        //Click on Text Box
//        driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div/div[1]/div/div/ul/li[1]/a")).click();

        //Enter full name
        WebElement fullname = driver.findElement(By.id("fullname"));
        fullname.sendKeys("Wireless Sparrow");
//        if(fullname == null)
//        {
//            System.out.print("Please enter name");
//        }

        //Enter email
        driver.findElement(By.id("email")).sendKeys("sparrow@gmail.com");

        //Enter address
        driver.findElement(By.id("address")).sendKeys("Mumbai, Maharashtra, India");

        //Enter password
        driver.findElement(By.id("password")).sendKeys("1221@Pass");

        //Click on submit
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        System.out.print("Details added");

        //Quit browser
        driver.quit();

    }

}
