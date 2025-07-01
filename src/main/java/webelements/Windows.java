package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Windows {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
        String windowId = driver.getWindowHandle(); //Returns id of single browser window
        System.out.println(windowId);

        //New Tab button
        driver.findElement(By.xpath("//button[text()='New Tab']")).click();
        Set<String> windowIds = driver.getWindowHandles(); //Returns ids of multiple browser windows

        //iterator() method
        Iterator<String> iterator = windowIds.iterator();

        String parentWindow = iterator.next();
        String childWindow = iterator.next();

        Thread.sleep(2000);

        System.out.println("Parent window id : " + parentWindow);
        System.out.println("Child window id : " + childWindow);

        driver.switchTo().window(parentWindow);


        //

    }

}
