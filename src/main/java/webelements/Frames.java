package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
//        System.out.println("Page title is : " + driver.getTitle());
//
//        //Iframe 1
//        WebElement iframe1 = driver.findElement(By.xpath("//iframe[@src='new-tab-sample.php']"));
//        driver.switchTo().frame(iframe1);

        driver.get("https://ui.vision/demo/webtest/frames/");

        //Switch to frame1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.name("mytext1")).sendKeys("Switch to frame2");

        //Switch to main page
        driver.switchTo().defaultContent();

        //Switch to frame2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.name("mytext2")).sendKeys("Switch to frame3");

        driver.switchTo().defaultContent();

        //Switch to frame3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.name("mytext3")).sendKeys("Switch to iframe");

        //Switch to iframe inside frame
        WebElement iframe = driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
        driver.switchTo().frame(iframe);
        //Select option from multiple options, clear selection and select again
        driver.findElement(By.id("i6")).click();
        driver.findElement(By.xpath("//span[text()='Clear selection']")).click();
        driver.findElement(By.id("i9")).click();
        //Select from how do you plan to use the software
//        driver.findElement(RelativeLocator.with(By.id("i21")).toLeftOf(By.xpath("//span[text()='Web Testing']"))).click();
        driver.findElement(By.cssSelector("div[id='i21']")).click();
        driver.findElement(By.cssSelector("div[id='i27']")).click();
        //Select from dropdown
//        WebElement dropdown = driver.findElement(By.xpath("//span[text()='Choose']"));
//        dropdown.click();
//        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[3]/div/div/div[2]/div/div[2]/div[4]")).click();
        //Click on 'Clear form'
//        driver.findElement(By.xpath("//span[text()='Clear selection']")).click();
//        driver.findElement(RelativeLocator.with(By.xpath("//span[text()='Cancel']")).toLeftOf(By.xpath("//span[text()='Clear form']"))).click();


//        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        //Switch to frame4
        WebElement frame4 = driver.findElement(By.cssSelector("frame[src='frame_4.html']"));
        driver.switchTo().frame(frame4);
        driver.findElement(By.name("mytext4")).sendKeys("Text added in frame4");
        driver.switchTo().defaultContent();

        //Switch to frame5
        WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame5);
        driver.findElement(By.name("mytext5")).sendKeys("Click on the link");
        driver.findElement(By.linkText("https://a9t9.com")).click();



    }

}
