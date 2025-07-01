package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        //Name
        driver.findElement(By.id("name")).sendKeys("Jack Sparrow");
        //Email
        driver.findElement(By.id("email")).sendKeys("jsp@gmail.com");
        //Gender
        driver.findElement(By.id("gender")).click();
        //Mobile
        driver.findElement(By.id("mobile")).sendKeys("7744332211");
        //Date of Birth
        driver.findElement(By.id("dob")).sendKeys("12122000");
        Thread.sleep(2000);
        driver.findElement(By.id("dob")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("dob")).sendKeys("10102000");
        //Subjects
        driver.findElement(By.id("subjects")).sendKeys("Science");
        //Hobbies
        driver.findElement(By.xpath("//input[@id='hobbies']")).click();
        driver.findElement(RelativeLocator.with(By.cssSelector("input[type='checkbox']")).toLeftOf(By.xpath("//*[@id=\"practiceForm\"]/div[7]/div/div/div[2]/label"))).click();
        //Picture
        WebElement picture = driver.findElement(By.id("picture"));
        String filepath = "C:\\Users\\Kush\\AppData\\Local\\Packages\\Microsoft.WindowsFeedbackHub_8wekyb3d8bbwe\\LocalState\\{2fc8ec11-4a07-4603-8229-0cb41cbbda61}\\Capture0.png";
        picture.sendKeys(filepath);
        //Current Address
        driver.findElement(By.className("form-control")).sendKeys("Mumbai");
        //State and City
        WebElement stateDropdown = driver.findElement(By.id("state"));
        Select selectState = new Select(stateDropdown);
        selectState.selectByVisibleText("Uttar Pradesh");
        //City dropdown
        WebElement cityDropdown = driver.findElement(By.id("city"));
        Select selectCity = new Select(cityDropdown);
        selectCity.selectByVisibleText("Lucknow");
        selectCity.selectByIndex(1);


//        driver.quit();

    }

}
