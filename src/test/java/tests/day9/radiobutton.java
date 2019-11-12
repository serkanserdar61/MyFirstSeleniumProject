package tests.day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        driver.manage().window().maximize();
        Thread.sleep(3000);
      /* driver.findElement(By.xpath("//input[@value='Milk']")).click();
        System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());

        //if you are looking more than one button you have to use findElements(plural)*/

        int count=driver.findElements(By.xpath("//input[@name='group1']")).size();
        for(int i=0;i<count;i++){
          driver.findElements(By.xpath("//input[@name='group1']")).get(0).click();
          System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));


        String text= driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
    if(text.equals("Cheese")){
    driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

        }
    }
    }
 }
