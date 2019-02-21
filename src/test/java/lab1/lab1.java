package lab1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab1 extends lab11 {
    @Test
    public void TestLogin() {
       driver.get("https://www.facebook.com/");
       String getTitle=driver.getTitle();
        Assert.assertTrue(getTitle.equals("Facebook — Выполните вход или зарегистрируйтесь"));
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("dima.ribac@gmail.com");
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("odorash95");
        driver.findElement(By.id("u_0_2")).click();
        getTitle= driver.getTitle();
        Assert.assertTrue(getTitle.equals("Facebook"));
    }
    @Test
    public void CalculatorTest() throws InterruptedException {
        driver.get("C:\\Users\\User\\Desktop\\codifun\\calculator.html");
        String getTitle=driver.getTitle();
        Assert.assertTrue(getTitle.equals("Calculator"));
        driver.findElement(By.id("val1")).clear();
        driver.findElement(By.id("val1")).sendKeys("2");
        driver.findElement(By.id("val2")).clear();
        driver.findElement(By.id("val2")).sendKeys("3");
        driver.findElement(By.id("adunare")).click();
        getTitle= driver.getTitle();
        Assert.assertTrue(getTitle.equals("Calculator"));
        Thread.sleep(5000L);
    }
}
