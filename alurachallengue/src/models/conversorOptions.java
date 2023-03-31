package models;

public enum conversorOptions {
    USD_ARS("Dólares-Pesos"),
    ARS_USD("Pesos-Dólares"),
    USD_BOB("Dólares-Bolivianos"),
    BOB_USD("Bolivianos-Dólares"),
    USD_BRL("Dólares-Reales"),
    BRL_USD("Reales-Dólares"),
    USD_CLP("Dólares-Pesos Chilenos"),
    CLP_USD("Pesos Chilenos-Dólares"),
    USD_COP("Dólares-Pesos Colombianos"),
    COP_USD("Pesos Colombianos-Dólares"),
    USD_PYG("Dólares-Guaraníes"),
    PYG_USD("Guaraníes-Dólares"),
    USD_PEN("Dólares-Soles"),
    PEN_USD("Soles-Dólares"),
    USD_UYU("Dólares-Pesos Uruguayos"),
    UYU_USD("Pesos Uruguayos-Dólares");



    private String description;
    conversorOptions(String description){
        this.description=description;
    }
    public String getDescription() {
        return description;
    }
}
