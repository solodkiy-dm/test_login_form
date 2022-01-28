import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver", "/home/dm/IdeaProjects/chromedriver");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.saucedemo.com/");

       //не явное ожидание, implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //maximize our window
       driver.manage().window().maximize();

        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='user-name']"));
        inputUsername.click();
        inputUsername.sendKeys("standard_user");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
        inputPassword.click();
        inputPassword.sendKeys("secret_sauce");

//        WebElement loginData = driver.findElement(By.xpath("//input[@id='user-name']"));
//        Actions act = new Actions(driver);
//        act.moveToElement(loginData).doubleClick().build().perform();

        WebElement buttonLogin = driver.findElement(By.xpath
                ("//input[@class='submit-button btn_action']"));
        buttonLogin.click();

        WebElement title = driver.findElement(By.xpath("//span[text()='Products']"));

        WebElement item_name = driver.findElement(By.xpath
                ("(//div[@class='inventory_item_name'])[2]"));
        item_name.click();

        WebElement addButton = driver.findElement(By.xpath("//*[text()='Add to cart']"));
        addButton.click();

        WebElement shoppingCart = driver.findElement(By.xpath
                ("//a[@class='shopping_cart_link']"));
        shoppingCart.click();

        WebElement item_name2 = driver.findElement(By.xpath
                ("//div[text()='Sauce Labs Bike Light']"));
        System.out.println(item_name2);

    }
}
