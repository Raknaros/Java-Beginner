package models;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Double.parseDouble;


public class scrapCurrency {
    private static Map<String, BigDecimal> rateMap=new HashMap<>();
    private static String[] currencies={"Pesos Argentinos","Bolivianos","Reales","Pesos Chilenos","Pesos Colombianos","Guaranis","Soles","Pesos Uruguayos","Bolivares"};
    static int c=0;
    static int j=0;
    public static void main(String[] args) throws IOException {
        Document doc=Jsoup.connect("https://www.dollarfx.org/South-America").timeout(10000).get();
        Element soup=doc.select("div.cross-rates-body").first();
        Elements exchange=soup.select("div.c");
        for(Element i:exchange){
            if(!i.ownText().isEmpty()){
                if (c%2==0){
                    scrapCurrency.rateMap.put(currencies[j],new BigDecimal(parseDouble(i.ownText().replace(",",""))));
                    j++;
                }

                c++;
            }
        }
    }
}

