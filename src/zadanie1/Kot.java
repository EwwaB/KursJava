package zadanie1;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Kot {

    String imie;
    int wiek;

    public Kot(String imie) {
        this.imie = imie;
    }

    public Kot(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    Kot() {
        System.out.println("Powstał Kot");
    }


    boolean zlapMysz(Mysz ofiara, Mysz ofiara2) {
        System.out.println("próbuje zjeść dwie myszy");
        return false;

    }

    boolean zlapMysz(Mysz ofiara) {
        System.out.println("próbuje zjeść" + ofiara.imie);
        return ofiara.wiek>10;
    }


    boolean zlapMysz(Kot ofiara2) {
        return true;
    }
}
