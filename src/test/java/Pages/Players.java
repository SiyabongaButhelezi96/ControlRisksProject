package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Players {

    private WebDriver driver;
    private By leadingPlayer = By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[3]/section[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[2]/a");
    private By seeAllPlayerStats = By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[3]/div/div[1]/section[1]/div/div[1]/div/a");

    public Players(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickSeeAllPlayerStats()
    {

        driver.findElement(seeAllPlayerStats).click();
    }

    public void getLeadingPlayerName()
    {

        driver.findElement(leadingPlayer).getText();
    }
}

