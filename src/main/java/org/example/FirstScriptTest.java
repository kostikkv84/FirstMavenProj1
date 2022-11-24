package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstScriptTest {

    @Test
    public void eightComponents() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ya.ru/");

        String title = driver.getTitle();
      //  assertEquals("Web form", title);
      //  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("text"));
        WebElement submitButton = driver.findElement(By.xpath("/html/body/main/div[3]/form/div/button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

      //  WebElement message = driver.findElement(By.id("message"));
       // String value = message.getText();
       // assertEquals("Received!", value);

     //  driver.quit();
    }

}
