import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class RegistrationPageTest extends BasePageTest{
    RegistrationPage registrationPage = new RegistrationPage(driver);
    HomePage homePage;
    @Test
   //@Order(2)
    void fillSuccessfulRegisterForm(){
        registrationPage = new RegistrationPage(driver);

        registrationPage.clickButtonCreateAnAccount();

        driver.get(("http://localhost:5173/registration"));

        registrationPage.enterUsername("Testas18");
        registrationPage.enterEmail("testas18@gmail.com");
        registrationPage.enterPassword("Testas18.123");
        registrationPage.enterConfirmPassword("Testas18.123");
       registrationPage.clickButtonCreateAnAccount();

       // String actualTitle = registrationPage.clickButtonCreateAnAccount();
       // String excpectedTitle = "PlanPro";
       // Assertions.assertEquals(excpectedTitle, actualTitle);

    }
}
