package kolekcje;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Listy {

    public static void main(String[] args) {
        List<Integer> liczby = new ArrayList<>();

        liczby.add(2);
        liczby.add(15);
        liczby.add(1);
        liczby.add(15);
        liczby.add(15);
        liczby.add(15);

        System.out.println(liczby);
        Integer obiekt = new Integer(15);
        liczby.remove(new Integer(15));
        System.out.println(liczby);

        liczby.clear();
        System.out.println(liczby);
    }
}
