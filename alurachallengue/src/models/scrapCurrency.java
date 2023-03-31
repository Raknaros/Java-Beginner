package models;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class scrapCurrency {
    public static Map<String, BigDecimal> sellRate=new HashMap<>();
    static int c=0;
    public static void main(String[] args) throws IOException {
        Document doc=Jsoup.connect("https://www.dollarfx.org/South-America").timeout(10000).get();
        Element soup=doc.select("div.cross-rates-body").first();
        Elements exchange=soup.select("div.c");
        for(Element i:exchange){
            if(!i.ownText().isEmpty()){
                if (c%2==0){
                    sellRate.add(i.ownText());
                }
                c++;
            }
        }
        System.out.println(sellRate);

    }
}

