import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    @FindBy(css = "#root > div > div.sc-gFqAYk.ixfqVX > div > form > div.sc-kpDprT.ijQzVX > a")
    WebElement buttonRegister;
    @FindBy(xpath = "//*[@id=\"root\"]/div/form/div[1]/input")
    WebElement inputUsername;
    @FindBy(css = "#root > div > form > div:nth-child(2) > input")
    WebElement inputEmail;
    @FindBy(css = "#root > div > form > div:nth-child(3) > input")
    WebElement inputPassword;
    @FindBy(css = "#root > div > form > div:nth-child(4) > input")
    WebElement inputConfirmPassword;
    @FindBy(xpath = "//*[@id=\"root\"]/div/form/button")
    WebElement createAnAccountButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/form/div[1]/input")
    WebElement inputEmailLog;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/form/div[2]/input")
    WebElement inputPasswordLog;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/form/button")
    WebElement signInButton;

    public void clickButtonRegister() {
        buttonRegister.click();
    }

    public void enterUsername(String username) {
        inputUsername.sendKeys(username);
    }

    public void enterEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void enterPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void enterConfirmPassword(String password) {
        inputConfirmPassword.sendKeys(password);
    }

    // public void clickButtonCreateAccount() {
    //driver.findElement(By.id("createAccount")).click();}


    public void clickButtonCreateAnAccount() {
        createAnAccountButton.click();
    }

    public void enterEmailLog(String email) {inputEmailLog.sendKeys(email);
    }

    public void enterPasswordLog(String password) {
        inputPasswordLog.sendKeys(password);

    }
    public void clickButtonLogin() {
        signInButton.click();
    }
    public void waitForLoginPage(){
        wait.until(ExpectedConditions.urlToBe("http://localhost:5173/"));
    }



}