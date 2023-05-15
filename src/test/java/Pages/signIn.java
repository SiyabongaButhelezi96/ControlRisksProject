package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class signIn {

    private WebDriver driver;
    private By createNewAccount = By.id("//a[contains(text(), 'Don’t have an NBA ID?')]");
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By signInButton = By.className("Button_button__L2wUb SignIn_signInButton__0Y3MN");
    private By firstNameInput = By.id("firstName");
    private By lastNameInput = By.id("lastName");
    private By birthMonthDropdown = By.name("dobMonth");
    private By birthYearDropdown = By.name("dobyear");
    private By countryDropdown = By.name("country");
    private By termsCheckbox = By.name("privacyConsent");
    private By createAccountButton = By.id("submit");

    public signIn(WebDriver driver)
    {
        this.driver = driver;
    }
    public void enterEmail(String email)
    {

        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password)
    {

        driver.findElement(passwordInput).sendKeys(password);
    }

    public void enterFirstName(String name)
    {

        driver.findElement(firstNameInput).sendKeys(name);
    }

    public void enterLastName(String lastName)
    {

        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void selectMonth(String month)
    {
        Select dropdown = new Select(driver.findElement(birthMonthDropdown));

        dropdown.selectByVisibleText(month);
    }

    public void selectYear(String year)
    {
        Select dropdown = new Select(driver.findElement(birthYearDropdown));

        dropdown.selectByVisibleText(year);
    }


    public void clickCreateAccount()
    {

        driver.findElement(createAccountButton).click();
    }

    public void clickSignInButton()
    {

        driver.findElement(signInButton).click();
    }

    public void clickCreateNewAccount()
    {

        driver.findElement(createNewAccount).click();
    }

    public void clickTermsCheckbox()
    {

        driver.findElement(termsCheckbox).click();
    }


}
