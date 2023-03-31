package models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

public class magnitudeList {
    public static ArrayList<HashMap> magnitudes=new ArrayList<>();
    public static HashMap<String, BigDecimal> longitud=new HashMap<>();
    public static HashMap<String, BigDecimal> masa=new HashMap<>();
    public static HashMap<String, BigDecimal> temperatura=new HashMap<>();

    public static void main(String[] args) {

        longitud.put("Kilometros",new BigDecimal(1000));
        longitud.put("Yardas",new BigDecimal(0.9144));
        longitud.put("Millas",new BigDecimal(1609.34));
        masa.put("Kilogramos",new BigDecimal(1000));
        masa.put("Libras",new BigDecimal(453.59));
        masa.put("Onzas",new BigDecimal(28.70));
        temperatura.put("Kelvin",new BigDecimal(373.15));
        temperatura.put("Celcius",new BigDecimal(100));
        temperatura.put("Farenheit",new BigDecimal(212));
        magnitudes.add(longitud);
        magnitudes.add(masa);
        magnitudes.add(temperatura);

    }
}
