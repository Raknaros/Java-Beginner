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

        oWindow=driver.getWindowHandle();
        driver.get("https://www.sunat.gob.pe/sol.html");//pagina web
        driver.manage().window().maximize();//maximizar ventana
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));//tiempo de espera implicito
        driver.findElement(By.xpath("/html/body/section[1]/div/div/section[2]/div[2]/div/a/span")).click();//tramites y consultas
        for (String windowHandle : driver.getWindowHandles()) {
            if(!oWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }//cambiar a nueva ventana
        driver.findElement(By.id("txtRuc")).sendKeys("20602320830");//ingresar ruc
        driver.findElement(By.id("txtUsuario")).sendKeys("BLVARITY");//ingresar usuario
        driver.findElement(By.id("txtContrasena")).sendKeys("tuangfiff");//ingresar contrasena
        driver.findElement(By.id("btnAceptar")).click();//aceptar
        driver.manage().window().maximize();//maximizar ventana
        tempIframe1=driver.findElement(By.id("ifrVCE"));//selecionar iframe validacion de datos
        driver.switchTo().frame(tempIframe1);//cambiar a iframe
        tempDialog=driver.findElement(By.className("modal-dialog"));//cambiar a dialogo modal
        tempDialog.findElement(By.id("btnFinalizarValidacionDatos")).click();
        driver.findElement(By.id("btnCerrar")).click();
        driver.switchTo().parentFrame();
        driver.findElement(By.id("divOpcionServicio2")).click();
        driver.findElement(By.id("nivel1_12")).click();
        driver.findElement(By.id("nivel2_12_8")).click();
        driver.findElement(By.id("nivel3_12_8_1")).click();
        driver.findElement(By.id("nivel4_12_8_1_1_2")).click();
        tempIframe2=driver.findElement(By.id("iframeApplication"));
        driver.switchTo().frame(tempIframe2);
        tempButton1=driver.findElement(By.xpath("//*[@id=\"consultageneral\"]/div[4]/div[1]/div/select"));
        Select select1=new Select(tempButton1);
        select1.selectByValue("0621");
        //driver.quit();
        tempButton1=driver.findElement(By.xpath("//*[@id=\"consultageneral\"]/div[7]/div/div[2]/div[1]/div[2]/div[1]/select"));
        select1=new Select(tempButton1);
        select1.selectByValue("01");
        tempButton1=driver.findElement(By.xpath("//*[@id=\"consultageneral\"]/div[7]/div/div[2]/div[1]/div[2]/div[2]/select"));
        Select select3=new Select(tempButton1);
        select3.selectByValue("2022");
        tempButton1=driver.findElement(By.xpath("//*[@id=\"consultageneral\"]/div[7]/div/div[2]/div[2]/div[2]/div[1]/select"));
        Select select4=new Select(tempButton1);
        select4.selectByValue("06");
        tempButton1=driver.findElement(By.xpath("//*[@id=\"consultageneral\"]/div[7]/div/div[2]/div[2]/div[2]/div[2]/select"));
        Select select5=new Select(tempButton1);
        select5.selectByValue("2022");
        driver.findElement(By.id("btnBuscar")).click();
        int downpedidos=12;
        List<WebElement> pdts=driver.findElements(By.className("bg"));
        for(WebElement pdt:pdts){
            pdt.click();
            String resumen=pdt.findElement(By.tagName("input")).getAttribute("value");
            System.out.println(resumen);
            /*String[] resumensplit=resumen.split(";",0);
            String[] nroOrden=(resumensplit[5]).split("=",0);
            System.out.println(nroOrden[1]);*/
            downpedidos=downpedidos-1;
        }
        /*driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[3]/input")).click();
        driver.findElement(By.id("btnRegistrarPedido")).click();
        driver.findElement(By.id("btnAnteriorPedido")).click();*/
    }
}