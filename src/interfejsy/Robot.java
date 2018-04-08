package interfejsy;

public class Robot implements  Informacje, SekretneInformacje{

    private int numerSeryjny;// zmienna / pole

    public Robot(int numerSeryjny) {
        this.numerSeryjny = numerSeryjny; //konstruktor z przypisaną wartością
    }

    public Robot() {

    }

    public void uruchom (){
        System.out.println("Robot nr " + numerSeryjny + "został uruchomiony." ); //metoda
    }


    @java.lang.Override
    public void pokazInformacje() {
        System.out.println("Numer seryjny robote, to: " + numerSeryjny);
    }

    public void sekretnaFunckja(){
        System.out.println("to moj sekrtet!!!!");
    }
}
