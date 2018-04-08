package mójPierwszyPakiet;

/**
 * Created by bania on 16.09.2017.
 */
public class ObliczeniaPolaKwadratu {
    public static void main(String[]args) {


        Kwadrat kwadrat;
        kwadrat = new Kwadrat();

        kwadrat.bok =10;
        System.out.println(kwadrat.bok*kwadrat.bok);


        for (int i=0; i<=10; i++){
            kwadrat.bok= i;
            System.out.println(kwadrat.bok*kwadrat.bok);
        }
    }
}
