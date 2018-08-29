package com.company;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class OefMap1 {

    public static void main(String[] args) {

        List<Product> producten = new ArrayList<>();

        producten.add(new Product("PLU-1", "gom", 4));
        producten.add(new Product("PLU-2", "potlood", 2));
        producten.add(new Product("PLU-3", "lat", 8));

        Factuur factuur = new Factuur(LocalDate.now(), "Studio100");

        factuur.addProduct(producten.get(0));
        factuur.addProduct(producten.get(1));
        factuur.addProduct(producten.get(1));

        for(FactuurLijn lijn: factuur){
            System.out.printf("%s (%d stuks): %d EUR%n", lijn.getProduct().getOmschrijving(), lijn.getAantal(), lijn.getPrijs());
        }

        System.out.printf("Totaalprijs: %d EUR%n", factuur.getTotaalPrijs());

    }
}


class Product{
    private String code;
    private String omschrijving;
    private int prijs;

    public Product(String code, String omschrijving, int prijs) {
        this.code = code;
        this.omschrijving = omschrijving;
        this.prijs = prijs;
    }

    public String getCode() {
        return code;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public int getPrijs() {
        return prijs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(code, product.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}

/*
potlood (2 stuks): 4 EUR
gom (1 stuks): 4 EUR
Totaalprijs: 8 EUR
 */