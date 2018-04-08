package mójPierwszyPakiet;

/**
 * Created by bania on 07.10.2017.
 */
public class kalendarz {
    public static void main(String[] args){

        String[] tablica = new String[]{"styczeń", "luty", "marzec", "kwiecień", "maj", "czerwiec", "lipiec",
                "sierpień","wrzesień","październik","listopad","grudzień"};
        String styczen = tablica[0];
        tablica[0]= tablica[5];
        String luty = tablica[1];
        tablica[1]= tablica[4];
        String marzec = tablica[2];
        tablica[2]= tablica[3];
        tablica[3]= marzec;
        tablica[4]= tablica[1];
        tablica[4] = luty;
        tablica[5]= tablica[0];
        tablica[5]= styczen;

//        System.out.println(tablica[0]);
//        System.out.println(tablica[1]);
//        System.out.println(tablica[2]);
//        System.out.println(tablica[3]);
//        System.out.println(tablica[4]);
//        System.out.println(tablica[5]);


        if( ((5 < 7) || (2 == 2)) && 3>2 ){
            System.out.println("hello");
        }




    }
}
