package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class loginEmpresa {
    static WebElement tempIframe1,tempDialog;
    static String oWindow,ruc,usu,clave;

    loginEmpresa(String ruc){
        this.ruc=ruc;
    }
    loginEmpresa(String ruc, String usu, String clave){
        this.ruc=ruc;
        this.usu=usu;
        this.clave=clave;
    }
    public void login(WebDriver driver){
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
        driver.findElement(By.id("txtRuc")).sendKeys(ruc);//ingresar ruc
        driver.findElement(By.id("txtUsuario")).sendKeys(usu);//ingresar usuario
        driver.findElement(By.id("txtContrasena")).sendKeys(clave);//ingresar contrasena
        driver.findElement(By.id("btnAceptar")).click();//aceptar
        driver.manage().window().maximize();//maximizar ventana
        try {
            tempIframe1=driver.findElement(By.id("ifrVCE"));//selecionar iframe validacion de datos
            driver.switchTo().frame(tempIframe1);//cambiar a iframe
            tempDialog=driver.findElement(By.className("modal-dialog"));//cambiar a dialogo modal
            tempDialog.findElement(By.id("btnFinalizarValidacionDatos")).click();
            driver.findElement(By.id("btnCerrar")).click();
            driver.switchTo().parentFrame();
        } catch(Exception ignored){}
        finally {
            driver.switchTo().parentFrame();
        }
    }
}
