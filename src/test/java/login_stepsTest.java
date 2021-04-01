import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


  public class login_stepsTest {
    private WebDriver driver;

    @Before
    public  void setUp(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.bemol.com.br/login");
}

    @Dado("^que faço o login$")
    public void que_faço_o_login() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"profile-orders-2\"]/div[1]/a")).click();
    }

    @Quando("^insiro as credenciais$")
    public void insiro_as_credenciais() throws Throwable {
        //logando no site
        driver.findElement(By.id("widget75-email")).sendKeys("bruna.vasconcelos@ham.org.br");
        driver.findElement(By.id("widget75-password")).sendKeys("221204@biel");
        driver.findElement(By.id("widget75-submit")).submit();
    }

    @Então("^visualizo a minha pagina de cliente$")
    public void visualizo_a_minha_pagina_de_cliente() throws Throwable {
        //validando
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String texto = driver.findElement(By.xpath("//span[text()='bruna']")).getText();
        Assert.assertEquals("bruna",texto);
    }
    @After
    public void tearDown(){
    driver.quit();
    }
    }