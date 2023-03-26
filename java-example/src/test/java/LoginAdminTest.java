import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginAdminTest {
  private WebDriver driver;
  private WebDriverWait wait;

  @BeforeEach
  public void start() {

//    System.setProperty("webdriver.edge.verboseLogging", "true");
//    EdgeDriverService service = EdgeDriverService.createDefaultService();
//    driver = new EdgeDriver(service);

//    InternetExplorerOptions options = new InternetExplorerOptions();
//    options.requireWindowFocus();
//    driver = new InternetExplorerDriver(options);
//
//    FirefoxOptions options = new FirefoxOptions();
//    options.setBinary(new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe")));
//    driver = new FirefoxDriver(options);
//    System.out.println(((HasCapabilities) driver).getCapabilities());

    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  @Test
  public void loginAdminTest() {
    driver.navigate().to("http://localhost:8080/litecart/admin/login.php");
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("remember_me")).click();
    driver.findElement(By.name("login")).click();
  }

  @AfterEach
  public void stop() {
    driver.quit();
    driver = null;
  }
}
