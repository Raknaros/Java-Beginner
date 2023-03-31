package models;

import java.math.BigDecimal;

public enum conversorOptions {
    USD("Dólares",new BigDecimal(1)),
    ARS("Pesos Argentinos", new BigDecimal(1)),
    BOB("Bolivianos", new BigDecimal(1)),
    BRL("Reales", new BigDecimal(1)),
    CLP("", new BigDecimal(1)),
    COP("Reales-Dólares", new BigDecimal(1)),
    PYG("Dólares-Pesos Chilenos", new BigDecimal(1)),
    PEN("Pesos Chilenos-Dólares", new BigDecimal(1)),
    UYU("Dólares-Pesos Colombianos", new BigDecimal(1));



    private String description;
    private BigDecimal value;
    conversorOptions(String description, BigDecimal value){
        this.description=description;
        this.value=value;
    }
    public String getDescription() {
        return description;
    }
}
