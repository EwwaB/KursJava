package javastart;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Firma {
    public static void main(String[] args) {

        Pracownik bolek;
        Pracownik zdzichu;

        //bolek = new Pracownik("bolek","muzyka",22);
        zdzichu = new Pracownik("zdzichu","muzyczka", 12);

        bolek = new Pracownik();

        bolek.imie="bolek";
        bolek.nazwisko="muzyka";
        bolek.wiek=22;

        System.out.println(bolek.nazwisko);
        System.out.println(zdzichu.imie);


        zdzichu.imie="franek";

        System.out.println(zdzichu.imie);

        zdzichu.zmienWiek(100);
        System.out.println(zdzichu.wiek);

    }

}
