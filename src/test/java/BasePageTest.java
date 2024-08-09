import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasePageTest {
    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new EdgeDriver();
        driver.get("http://localhost:5173/");
        driver.manage().window().maximize();
    }

   // @AfterEach
    //public void tearDown() {
       // if(driver!=null){
          //  driver.quit();}
   // }
}
