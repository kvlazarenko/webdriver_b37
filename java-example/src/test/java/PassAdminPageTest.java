import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PassAdminPageTest extends TestBase {
  private WebDriver driver;
  private WebDriverWait wait;

  @BeforeEach
  public void start() {

    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  @Test
  public void PassAdminPageTest() {
    driver.navigate().to("http://localhost:8080/litecart/admin/login.php");
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("remember_me")).click();
    driver.findElement(By.name("login")).click();

    driver.findElement(By.linkText("Appearence")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-logotype")).click();
    driver.findElement(By.cssSelector("td#content h1"));

    driver.findElement(By.linkText("Catalog")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-product_groups a")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-option_groups a")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-manufacturers")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-suppliers")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-delivery_statuses")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-sold_out_statuses")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-quantity_units")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-csv")).click();
    driver.findElement(By.cssSelector("td#content h1"));

    driver.findElement(By.cssSelector("a[href='http://localhost:8080/litecart/admin/?app=countries&doc=countries']")).click();
    driver.findElement(By.cssSelector("td#content h1"));

    driver.findElement(By.cssSelector("a[href$='currencies']")).click();
    driver.findElement(By.cssSelector("td#content h1"));

    driver.findElement(By.cssSelector("a[href*='customers']")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-csv")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-newsletter")).click();
    driver.findElement(By.cssSelector("td#content h1"));

    driver.findElement(By.cssSelector("a[href*='geo_zones']")).click();
    driver.findElement(By.cssSelector("td#content h1"));

    driver.findElement(By.cssSelector("a[href*='languages']")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-storage_encoding a[href*='storage_encoding']")).click();
    driver.findElement(By.cssSelector("td#content h1"));

    driver.findElement(By.cssSelector("a[href*='jobs']")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-customer")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-shipping")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-payment")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-order_total")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-order_success")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-order_action")).click();
    driver.findElement(By.cssSelector("td#content h1"));

    driver.findElement(By.cssSelector("a[href*='orders']")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-order_statuses")).click();
    driver.findElement(By.cssSelector("td#content h1"));

    driver.findElement(By.cssSelector("a[href*='pages']")).click();
    driver.findElement(By.cssSelector("td#content h1"));

    driver.findElement(By.cssSelector("a[href*='monthly_sales']")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-most_sold_products")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-most_shopping_customers")).click();
    driver.findElement(By.cssSelector("td#content h1"));

    driver.findElement(By.cssSelector("a[href*='store_info']")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-defaults")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-general")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-listings")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-images")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-checkout")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-advanced")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-security")).click();
    driver.findElement(By.cssSelector("td#content h1"));

    driver.findElement(By.cssSelector("a[href*='slides']")).click();
    driver.findElement(By.cssSelector("td#content h1"));

    driver.findElement(By.cssSelector("a[href*='tax_classes']")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-tax_rates")).click();
    driver.findElement(By.cssSelector("td#content h1"));

    driver.findElement(By.cssSelector("a[href*='doc=search']")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-scan")).click();
    driver.findElement(By.cssSelector("td#content h1"));
    driver.findElement(By.cssSelector("li#doc-csv")).click();
    driver.findElement(By.cssSelector("td#content h1"));

    driver.findElement(By.cssSelector("a[href*='users']")).click();
    driver.findElement(By.cssSelector("td#content h1"));

    driver.findElement(By.cssSelector("a[href*='vqmods']")).click();
    driver.findElement(By.cssSelector("td#content h1"));

  }

  @AfterEach
  public void stop() {
    driver.quit();
    driver = null;
  }
}
