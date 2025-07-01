package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Open website in browser
        driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");

        //Click Yes radio button
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/input")).click();
        Thread.sleep(2000);

        //Click Impressive radio button
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[3]/input")).click();
        Thread.sleep(2000);

        driver.quit();


    }

}
