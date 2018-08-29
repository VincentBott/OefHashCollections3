package com.company;


import java.time.LocalDate;

public class Factuur {

    private int totaalPrijs;
    private LocalDate datum;
    private String factuurnaam;


    public Factuur(LocalDate datum, String factuurnaam) {
        this.datum = datum;
        this.factuurnaam = factuurnaam;
    }


    public void addProduct(Product product) {

    }


    public int getTotaalPrijs() {
        this.totaalPrijs;
    }
}
