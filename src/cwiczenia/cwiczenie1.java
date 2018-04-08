package cwiczenia;

public class cwiczenie1 {


    public static void main(String[] args) {


        for (int a = 1; a <= 10; ++a) {
             //System.out.println(a * a);
            // wywolaj metode
           wywolajnazwe(a,1);


        }
    }

   static void wywolajnazwe(int a, int b){
        System.out.println("wywolajnazwe");

        System.out.println(a * a + b);

   }
}
