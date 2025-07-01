package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Open website in browser
        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");

        //Click on Elements
//        driver.findElement(By.id("headingOne")).click();

        //Click + Main Level 1
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/ul/li[1]/span[1]")).click();

        //Select Sub Level 1 checkbox
        driver.findElement(By.id("c_bf_1")).click();

        //Select Main Level 2 checkbox
        driver.findElement(By.id("c_bs_2")).click();

        //Click + Main Level 2
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/ul/li[2]/span[1]")).click();
        Thread.sleep(2000);

        //Unselect Sub Level 3 checkbox
        driver.findElement(By.id("c_bf_3")).click();

        driver.quit();

    }

}
