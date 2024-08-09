import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BasePageTest {
    HomePage homePage = new HomePage(driver);
   // RegistrationPage registrationPage;
    @Test
   // @Order(1)
    void clickCreateAccountbutton(){
       HomePage homePage = new HomePage(driver);
       homePage = new HomePage(driver);
        homePage.clickButtonRegister();
        //RegistrationPage registrationPage = new RegistrationPage(driver);
        homePage.enterUsername("Testas38");
       homePage.enterEmail("testas58@gmail.com");
        homePage.enterPassword("Testas38.123");
        homePage.enterConfirmPassword("Testas38.123");
        homePage.clickButtonCreateAnAccount();
        homePage.waitForLoginPage();
        homePage.enterEmailLog("testas58@gmail.com");
        homePage.enterPasswordLog("Testas38.123");
        homePage.clickButtonLogin();


        //String actualTitle = registrationPage.getTitleRegistration();
       // String expectedTitle = "PlanPro";
       // Assertions.assertEquals(expectedTitle, actualTitle);


    }
}
