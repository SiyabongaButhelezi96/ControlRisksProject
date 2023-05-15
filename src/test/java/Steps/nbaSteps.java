package Steps;

import Pages.Players;
import Pages.homePage;
import Pages.signIn;
import io.cucumber.java.en.And;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class nbaSteps {

    private WebDriver driver=null;
    private homePage homePage;
    private Players players;
    private signIn signIn;

    @Test
    public void browser_is_open() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable notifications");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY,options);
        options.merge(capabilities);

        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver_win32 (2)/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://nba.com/");

        homePage = new homePage(driver);
        players = new Players(driver);
        signIn = new signIn(driver);

        homePage.clickSignIn();
        homePage.clickSignInWithID();

        signIn.clickCreateNewAccount();
        signIn.enterEmail("siya@gmail.com");
        signIn.enterPassword("siya@gmail.com");
        signIn.enterFirstName("Siyabonga");
        signIn.enterLastName("Buthelezi");
        signIn.selectMonth("May");
        signIn.selectYear("1996");
        signIn.clickTermsCheckbox();
        signIn.clickCreateAccount();
    }

    @Test
    public void validUsernameAndPassword() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://nba.com/");

        homePage = new homePage(driver);
        players = new Players(driver);
        signIn = new signIn(driver);

        homePage.clickSignIn();
        homePage.clickSignInWithID();

        signIn.enterEmail("signInButton");
        signIn.enterPassword("SIya@nba");
        signIn.clickSignInButton();

    }

    @Test
    public void validUsernameAndIncorrectPassword() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://nba.com/");

        homePage = new homePage(driver);
        players = new Players(driver);
        signIn = new signIn(driver);

        homePage.clickSignIn();
        homePage.clickSignInWithID();

        signIn.enterEmail("buthelezisiyabonga96@gmail.com");
        signIn.enterPassword("SIya@nba1");
        signIn.clickSignInButton();

    }
    @Test
    public void invalidUsernameAndPassword() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://nba.com/");

        homePage = new homePage(driver);
        players = new Players(driver);
        signIn = new signIn(driver);

        homePage.clickSignIn();
        homePage.clickSignInWithID();

        signIn.enterEmail("buthelezisiyabonga@gmail.com");
        signIn.enterPassword("SIya@nba");
        signIn.clickSignInButton();

    }

    @Test
    public void invalidUsernameAndIncorrectPassword() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://nba.com/");

        homePage = new homePage(driver);
        players = new Players(driver);
        signIn = new signIn(driver);

        homePage.clickSignIn();
        homePage.clickSignInWithID();

        signIn.enterEmail("buthelezisiyabonga@gmail.com");
        signIn.enterPassword("SIya@nba1");
        signIn.clickSignInButton();

    }


}
