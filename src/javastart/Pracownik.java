package javastart;

public class Pracownik {


    String imie;
    String nazwisko;
    int wiek;


    public Pracownik(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Pracownik() {

    }

    void zmienWiek(int wiek) {
        this.wiek=wiek;

    }




}
