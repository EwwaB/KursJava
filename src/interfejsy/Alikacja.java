package interfejsy;

public class Alikacja {

    public static void  main(String[] args) { // metoda startowa

        Robot robot = new Robot(1954);
        robot.uruchom();

        Czlowiek czlowiek = new Czlowiek("Alan");
        czlowiek.oddychaj();

        Informacje[] informacje = new Informacje[] {czlowiek, robot}; // tablica typu informacja dwu elementowa

        Informacje [] tablica = new Informacje[2];
        tablica [0]= czlowiek;
        tablica [1]= robot;

        for (Informacje i: informacje){
            i.pokazInformacje();
        }

        SekretneInformacje robot2 = new Robot(123);
        robot2.sekretnaFunckja();

        SekretneInformacje czlowiek2 = new Czlowiek("Edwin");
        czlowiek2.sekretnaFunckja();



    }
}
