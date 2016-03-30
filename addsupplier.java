import com.sun.java.swing.plaf.windows.resources.windows;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 25/03/2016.
 */
public class addsupplier extends BaseMain{
    public addsupplier Addsupplier(){
        System.out.println("adding new suppleir");
        driver.findElement(By.xpath("//*[@id='submit']")).click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[2]/a/button"));
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();

//        WebElement element = driver.findElement(By.xpath("//*[@id='mytrm']/div/div/div[2]/a/button"));
//        JavascriptExecutor js =(JavascriptExecutor)driver;
//        js.executeScript("window.scrollTo(0)",element.getLocation().x+"");
//        element.click();

        //html/body/div[2]/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[2]/a/button
//        driver.getWindowHandle();
        //Iterator iterator= windows.iterator();


        return this;
    }
    public LogoutAC verifyingsupplier(){
        driver.findElement(By.xpath("html/body/div[2]/div[1]/ul/li[5]/a")).click();
        driver.findElement(By.xpath("html/body/div[2]/div[1]/ul/li[5]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys("superstar");

        Assert.assertTrue("Checking the suppliers ",driver.findElement(By.tagName("body")).getText().contains("superstar"));
return new LogoutAC();
    }
}
