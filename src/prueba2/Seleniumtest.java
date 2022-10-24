package prueba2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Seleniumtest {
     public static void main (String[] args)throws InterruptedException {

    	 System.setProperty("webdriver.edge.driver","C:\\Softwares\\edge\\msedgedriver.exe");
    	 WebDriver driver = new EdgeDriver();
         driver.get("https://www.amazon.com/");
         //inserta tu código aquí
         Thread.sleep(500000000);
         driver.quit();
}
}