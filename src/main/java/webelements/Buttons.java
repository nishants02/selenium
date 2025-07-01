package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");

        //Click 'Click Me' button
        driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();

        //Right click 'Right Click Me' button
        WebElement rightClickButton = driver.findElement(By.cssSelector("button[class='btn btn-secondary']"));
        Actions click = new Actions(driver);
        click.contextClick(rightClickButton).perform();
        Thread.sleep(2000);

        //Double click 'Double Click Me' button
        WebElement doubleClickButton = driver.findElement(By.cssSelector("button[class='btn btn-success']"));
        Actions doubleClick = new Actions(driver);
        doubleClick.doubleClick(doubleClickButton).perform();
        Thread.sleep(2000);

        //Click to close the context menu (right click menu)
        driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();



    }

}
