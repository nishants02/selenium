package webelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");

        //Click on 'Alert' button
        driver.findElement(By.xpath("//button[text()='Alert']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text : " + alert.getText());
        alert.accept();

        //Click on 1st 'Click Me' button
        driver.findElement(By.xpath("//button[@onclick='myMessage()']")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert2 = driver.switchTo().alert();
        System.out.println("Alert 2 text : " + alert2.getText());
        alert.accept();

        //Click on 2nd 'Click Me' button
        driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert3 = driver.switchTo().alert();
        System.out.println("Alert 3 text : " + alert3.getText());
        alert.dismiss();

        driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        alert.accept();

        //Click on 3rd 'Click Me' button
        driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert4 = driver.switchTo().alert();
//        Thread.sleep(2000);
        System.out.println("Alert 4 text is : " + alert4.getText());
        alert4.sendKeys("Text added");
        Thread.sleep(2000);
        alert4.accept();



    }

}
