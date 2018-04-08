package cwiczenia;

public class cwiczenie2 {
    
    public static void main(String[] args) {

        String nazwaJakas = "alamakfjksdjfkdsaklfkjlsdajklfadsjl;kota";
        int ile = 1;
        char litera = '@';
        nazwaJakas = obetnijLitere(nazwaJakas, ile);
        nazwaJakas = dodajLitere(nazwaJakas, litera);

        int x1 = nazwaJakas.length() - 2;
        int x2 = nazwaJakas.length() - 1;

        while (x1 >= 0) {
            System.out.println(nazwaJakas);
            nazwaJakas = obetnijLitereRazyDwa(nazwaJakas, x1, x2);
            nazwaJakas = dodajLitere(nazwaJakas, litera);
            x1--;
            x2--;
        }
    }

    private static String obetnijLitere(String nazwaJakas, int ile) {
        nazwaJakas = nazwaJakas.substring(0, nazwaJakas.length() - ile);
        return nazwaJakas;
    }

    private static String obetnijLitereRazyDwa(String nazwaJakas, int x1, int x2) {
        nazwaJakas = nazwaJakas.substring(0, x1) +
                nazwaJakas.substring(x2, nazwaJakas.length());
        return nazwaJakas;
    }

    public static String dodajLitere(String nazwajakas, char litera) {
        nazwajakas = nazwajakas + litera;
        return nazwajakas;

    }
}
