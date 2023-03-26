import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class MyFirstTest {
  private WebDriver driver;
  private WebDriverWait wait;

  @BeforeEach
  public void start() {

    System.setProperty("webdriver.edge.verboseLogging", "true");
    EdgeDriverService service = EdgeDriverService.createDefaultService();
    driver = new EdgeDriver(service);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//    InternetExplorerOptions options = new InternetExplorerOptions();
//    options.requireWindowFocus();
//    driver = new InternetExplorerDriver(options);
//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//
//    FirefoxOptions options = new FirefoxOptions();
//    options.setBinary(new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe")));
//    driver = new FirefoxDriver(options);
//    System.out.println(((HasCapabilities) driver).getCapabilities());
//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//    driver = new ChromeDriver();
//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  @Test
  public void myFirstTest() {
    driver.navigate().to("http://www.google.com");
    driver.findElement(By.name("q")).sendKeys("webdriver");
    driver.findElement(By.name("btnK")).click();
    wait.until(titleIs("webdriver - Поиск в Google"));
  }

  @AfterEach
  public void stop() {
    driver.quit();
    driver = null;
  }
}
