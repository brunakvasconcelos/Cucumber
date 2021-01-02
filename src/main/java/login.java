
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


    public class login {
        private WebDriver driver;

        @Dado("^que acessei o site \"([^\"]*)\"$")
        public void que_acessei_o_site(String arg1) throws Throwable {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.bemol.com.br/");
        }

        @Quando("^clico em faça o login$")
        public void clico_em_faça_o_login() throws Throwable {
            driver.findElement(By.xpath("//*[@id=\"profile-orders-2\"]/div[1]/a")).click();
        }

        @Quando("^informo o e-mail \"([^\"]*)\"$")
        public void informo_o_e_mail(String arg1) throws Throwable {
            driver.findElement(By.id("widget75-email")).sendKeys(arg1);
        }

        @Quando("^a senha \"([^\"]*)\"$")
        public void a_senha(String arg1) throws Throwable {
            driver.findElement(By.id("widget75-password")).sendKeys(arg1);
        }

        @Quando("^seleciono Entrar$")
        public void seleciono_Entrar() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
            driver.findElement(By.id("widget75-submit")).click();
        }

        @Então("^visualizo a minha pagina de cliente$")
        public void visualizo_a_minha_pagina_de_cliente() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
            //String texto = driver.findElement(By.xpath("//*[@id=\"profile-orders-2\"]/div[2]/div[1]")).getText();
            String texto = driver.findElement(By.xpath("//div[@class='user-info']")).getText();
            // Assert.assertEquals("Olá, bruna",texto);
        }
    }




