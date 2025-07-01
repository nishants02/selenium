package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDownload {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");

        driver.findElement(By.id("downloadButton")).click();

        //Upload a file
        WebElement uploadFile = driver.findElement(By.id("uploadFile"));
        String filePath = "C:\\Users\\Kush\\Downloads\\sampleFile.jpeg";
        uploadFile.sendKeys(filePath);
        Thread.sleep(2000);

        filePath = "C:\\Users\\Kush\\AppData\\Local\\Packages\\Microsoft.WindowsFeedbackHub_8wekyb3d8bbwe\\LocalState\\{2fc8ec11-4a07-4603-8229-0cb41cbbda61}\\Capture0.png";
        uploadFile.sendKeys(filePath);


    }

}
