import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class crawler {
    private WebDriver driver;
    @BeforeEach
    public void setUp(){
        DesiredCapabilities caps=new DesiredCapabilities();
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://sunat.gob.pe");
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    @Test
    public void prueba(){
        driver.findElement(By.xpath("/html/body/section[1]/div/div/section[2]/div[2]/div/a")).click();
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    @AfterEach
    public void tearDown(){
        driver.close();
    }
}
