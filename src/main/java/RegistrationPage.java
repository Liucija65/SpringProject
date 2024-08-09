import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.lang.reflect.Type;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/form/div[3]/a")
    WebElement buttonRegister;

    @FindBy (xpath = "//*[@id=\"root\"]/div/form/div[1]/input")
    WebElement inputUsername;
    @FindBy(css = "#root > div > form > div:nth-child(2) > input")
    WebElement inputEmail;
    @FindBy(css = "#root > div > form > div:nth-child(3) > input")
    WebElement inputPassword;
    @FindBy(css = "#root > div > form > div:nth-child(4) > input")
    WebElement inputConfirmPassword;
    @FindBy(xpath = "//*[@id=\"root\"]/div/form/button")
   WebElement createAnAccountButton;
    public void clickButtonRegister(){
        buttonRegister.click();
    }
    public void waitForRegistrationPage(){
        wait.until(ExpectedConditions.urlToBe("http://localhost:5173/registration"));
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
     createAnAccountButton.click();}




     public String getTitleRegistration () {
      return driver.getTitle();}



}












