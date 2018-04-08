package zadanie1;

public class Polowanie {

    public static void main(String[] args) {

        Mysz szara = new Mysz ("szara", 22);
        Mysz czarna = new Mysz("czarna", 1 );
        Kot filemon = new Kot("filemon", 50);


        System.out.println(filemon.imie +" "+ filemon.wiek);

        System.out.println(filemon.zlapMysz(czarna));
        System.out.println(filemon.zlapMysz(szara));





    }
}
