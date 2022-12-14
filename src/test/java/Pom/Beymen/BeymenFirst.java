package Pom.Beymen;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BeymenFirst {
    public void genderButton(WebDriver driver)
    {
        driver.findElement(By.xpath("//button[@id='genderManButton']")).click();
    }
    public void searchButton(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//input[@aria-controls='3-suggestions']")).click();
        Thread.sleep(2000);

    }

    public void searchWrite(WebDriver driver)
    {
        driver.findElement(By.xpath("//input[@aria-controls='3-suggestions']")).sendKeys("Pantolon");

    }
    public void searchClick(WebDriver driver)
    {
        driver.findElement(By.xpath("//button[@class='o-header__search--btn bmi-search']")).click();

    }
    public void filterClick(WebDriver driver)
    {
        driver.findElement(By.xpath("//button[@id='productFilterOpenButton']")).click();
    }
    public void productTypeClick(WebDriver driver)
    {
        driver.findElement(By.xpath("//*[@id='productFilters']/span[5]/span")).click();
    }
    public void chechkboxPants(WebDriver driver)
    {
        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[11]/label")).click();
    }

    public void filterApplyClick(WebDriver driver)
    {
        driver.findElement(By.xpath("//button[@id='productFilterApplyButton']")).click();
    }
    public void productSelect(WebDriver driver)
    {
        driver.findElement(By.xpath("//div[@data-src='https://cdn.beymen.com/mnresize/{width}/{height}/productimages/q3pkccva.vu0_IMG_03_2110088545732.jpg']")).click();
    }
}
