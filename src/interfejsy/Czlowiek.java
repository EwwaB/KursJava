package interfejsy;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Czlowiek implements Informacje, SekretneInformacje{

    private String imie;


    public Czlowiek(String imie) {
        this.imie = imie;
    }

    public void  oddychaj (){
        System.out.println(imie + " zaczal oddychac. ");
    }

    @java.lang.Override
    public void pokazInformacje() {
        System.out.println("Imie człowieka, to" + imie);


    }

    @Override
    public void sekretnaFunckja() {
        System.out.println("Sekretna informacja człowiek");

    }
}
