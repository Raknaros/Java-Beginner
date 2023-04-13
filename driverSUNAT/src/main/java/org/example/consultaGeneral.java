package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Calendar;

public class consultaGeneral {
    static WebElement tempButton1,tempIframe2;
    long millis=System.currentTimeMillis();
    SimpleDateFormat formato=new SimpleDateFormat("MMYYYY");
    Calendar c=Calendar.getInstance();
    String tipo=null;
    String periodoinicial;
    String periodofinal;
    java.sql.Date date=new java.sql.Date(millis);
    consultaGeneral(){
        c.setTime(date);
        c.add(Calendar.MONTH,-1);
        this.periodofinal=formato.format(c.getTime());
        this.periodoinicial=this.periodofinal;
    }
    consultaGeneral(int periodos){
        c.setTime(date);
        c.add(Calendar.MONTH,-1);
        this.periodofinal=formato.format(c.getTime());
        c.add(Calendar.MONTH,((periodos-1)*-1));
        this.periodoinicial=formato.format(c.getTime());
    }

    consultaGeneral(String periodoinicial,String periodofinal){
        this.periodoinicial=periodoinicial;
        this.periodofinal=periodofinal;
    }
    consultaGeneral(String tipo, String periodoinicial,String periodofinal){
        this.tipo=tipo;
        this.periodoinicial=periodoinicial;
        this.periodofinal=periodofinal;
    }
    public void consultar(WebDriver driver){
        driver.findElement(By.id("divOpcionServicio2")).click();
        driver.findElement(By.id("nivel1_12")).click();
        driver.findElement(By.id("nivel2_12_8")).click();
        driver.findElement(By.id("nivel3_12_8_1")).click();
        driver.findElement(By.id("nivel4_12_8_1_1_2")).click();
        tempIframe2=driver.findElement(By.id("iframeApplication"));
        driver.switchTo().frame(tempIframe2);
        tempButton1=driver.findElement(By.xpath("//*[@id=\"consultageneral\"]/div[4]/div[1]/div/select"));
        Select select1=new Select(tempButton1);
        if (tipo!=null){
            select1.selectByValue(tipo);
        }
        tempButton1=driver.findElement(By.xpath("//*[@id=\"consultageneral\"]/div[7]/div/div[2]/div[1]/div[2]/div[1]/select"));
        select1=new Select(tempButton1);
        select1.selectByValue(periodoinicial.substring(0,2));
        tempButton1=driver.findElement(By.xpath("//*[@id=\"consultageneral\"]/div[7]/div/div[2]/div[1]/div[2]/div[2]/select"));
        Select select3=new Select(tempButton1);
        select3.selectByValue(periodoinicial.substring(2));
        tempButton1=driver.findElement(By.xpath("//*[@id=\"consultageneral\"]/div[7]/div/div[2]/div[2]/div[2]/div[1]/select"));
        Select select4=new Select(tempButton1);
        select4.selectByValue(periodofinal.substring(0,2));
        tempButton1=driver.findElement(By.xpath("//*[@id=\"consultageneral\"]/div[7]/div/div[2]/div[2]/div[2]/div[2]/select"));
        Select select5=new Select(tempButton1);
        select5.selectByValue(periodofinal.substring(2));
        driver.findElement(By.id("btnBuscar")).click();
    }

}
