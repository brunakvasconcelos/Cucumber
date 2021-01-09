import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_steps {
    private WebDriver driver;

    @Dado("^que faço o login$")
    public void que_faço_o_login() throws Throwable {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bemol.com.br/login");
        driver.findElement(By.xpath("//*[@id=\"profile-orders-2\"]/div[1]/a")).click();
    }

    @Quando("^insiro as credenciais$")
    public void insiro_as_credenciais() throws Throwable {
        driver.findElement(By.id("widget75-email")).sendKeys("bruna.vasconcelos@ham.org.br");
        driver.findElement(By.id("widget75-password")).sendKeys("221204biel");
        driver.findElement(By.id("widget75-submit")).click();

    }

    @Então("^visualizo a minha pagina de cliente$")
    public void visualizo_a_minha_pagina_de_cliente() throws Throwable {
        String texto = driver.findElement(By.xpath("//div[@class='user-info']")).getText();
        Assert.assertEquals("",texto);
    }
    }