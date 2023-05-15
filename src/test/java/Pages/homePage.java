package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {

    private WebDriver driver;

    private By signIn = By.xpath("//span[contains(text(), 'Sign In')]");
    private By signInWithID = By.xpath("//a[contains(text(), 'Sign in with NBA ID')]");
    private By navigation = By.xpath("//*[@class='NavHamburger_box__r0p_S']");
    private By players = By.xpath("//button[contains(text(),'Players')]");
    private By playerStats = By.xpath("//li//li//a[contains(text(),'Player Stats')]");
    private By leadingPlayer = By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[3]/section[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[2]/a");
    private By seeAllPlayerStats = By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[3]/div/div[1]/section[1]/div/div[1]/div/a");

    public homePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickSignIn()
    {

        driver.findElement(signIn).click();
    }

    public void clickSignInWithID()
    {

        driver.findElement(signInWithID).click();
    }

    public void clickNavigation()
    {

        driver.findElement(navigation).click();
    }

    public void clickPlayers()
    {

        driver.findElement(players).click();
    }

    public void clickPlayerStats()
    {

        driver.findElement(playerStats).click();
    }



}
