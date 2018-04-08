package klasyOrazMetody;

public class FabrykaProstokatow {

    public static void main(String[] args){
        Prostokat prostokatNumerJeden =new Prostokat(10,5);
        Prostokat prostokatNumerDwa =new Prostokat(101,2);

        System.out.println(prostokatNumerJeden.getA());
        System.out.println(prostokatNumerDwa.getB());

    }
}
