package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Main {
    static WebElement textBox1, textBox2,textBox3,submitButton,tempButton1,tempButton2,tempButton3,tempIframe1,tempIframe2,tempIframe3,tempDialog;
    static String oWindow,sWindow,tWindow;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));//tiempo de espera implicito
        loginEmpresa login=new loginEmpresa("20548030529","BATHROOR","Estudiomar1");
        login.login(driver);
        consultaGeneral consulta=new consultaGeneral("0621","012022","062022");
        consulta.consultar(driver);

        /*int downpedidos=12;
        List<WebElement> pdts=driver.findElements(By.className("bg"));
        for(WebElement pdt:pdts){
            pdt.click();
            String resumen=pdt.findElement(By.tagName("input")).getAttribute("value");
            System.out.println(resumen);
            /*String[] resumensplit=resumen.split(";",0);
            String[] nroOrden=(resumensplit[5]).split("=",0);
            System.out.println(nroOrden[1]);
            downpedidos=downpedidos-1;
        }
        /*driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[3]/input")).click();
        driver.findElement(By.id("btnRegistrarPedido")).click();
        driver.findElement(By.id("btnAnteriorPedido")).click();*/
    }
}
