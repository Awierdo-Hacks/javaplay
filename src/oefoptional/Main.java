package oefoptional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    static Integer som(Optional<Integer> g1, Optional<Integer> g2) {
        System.out.println("g1 is aanwezig? " + g1.isPresent());
        System.out.println("g2 is aanwezig? " + g2.isPresent());
        Integer waarde1 = g1.orElse(0);
        Integer waarde2 = g2.orElse(0);
        return waarde1 + waarde2;
    }

    static void testSom() {
        Optional<Integer> getal1 = Optional.empty();
        Optional<Integer> getal2 = Optional.ofNullable(null);
        System.out.println("som van "+getal1+" en "+getal2+" is " + som(getal1, getal2));
        getal1 = Optional.of(7);
        getal2 = Optional.of(6);
        System.out.println("som van "+getal1+" en "+getal2+" is " + som(getal1, getal2));
    }
   public static Optional<List<Integer>> geefPriem(Optional<Integer> van , Optional<Integer> tot){
       if (van.isEmpty() || tot.isEmpty()) {
           return Optional.empty();
       }

       int start = van.get();
       int eind = tot.get();

       if (start > eind) {
           return Optional.empty();
       }

       List<Integer> lijst = IntStream.rangeClosed(start, eind)
               .filter(Main::isPriem)
               .boxed()
               .collect(Collectors.toList());

       return lijst.isEmpty() ? Optional.empty() : Optional.of(lijst);
   }

    public static boolean isPriem(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        testSom();
        String naam = "Jef";
        if(naam != null)
            System.out.println("Hello "+naam);
        String naam2 = null;
        if(naam2 != null)
            System.out.println("Hello "+naam2);
        else
            System.out.println("naam2 is "+naam2);

        Optional<String> optionalNaam = Optional.of("Mia");
        optionalNaam.ifPresent( name -> System.out.println("Hello "+name ) );
        Optional<String> optionalNaam2 = Optional.ofNullable(null);
        optionalNaam2.ifPresent( name -> System.out.println("Hello "+name ) );
        optionalNaam2.ifPresentOrElse(
                name -> System.out.println("Hello "+name ),
                () -> System.out.println("OptionalNaam2 is null")
        );
        Optional<String> optionalNaam3 = Optional.empty();
        optionalNaam3.ifPresent( name -> System.out.println("Hello "+name ) );
        optionalNaam3.ifPresentOrElse(
                name -> System.out.println("Hello "+name ),
                () -> System.out.println("OptionalNaam3 is empty")
        );


        Optional<List<Integer>> resultaat1 = geefPriem(Optional.of(10), Optional.of(30));
        resultaat1.ifPresentOrElse(
                lijst -> System.out.println("Priemgetallen: " + lijst),
                () -> System.out.println("Geen geldige invoer of geen priemgetallen.")
        );

        // Test met ontbrekende waarde
        Optional<List<Integer>> resultaat2 = geefPriem(Optional.empty(), Optional.of(30));
        resultaat2.ifPresentOrElse(
                lijst -> System.out.println("Priemgetallen: " + lijst),
                () -> System.out.println("Geen geldige invoer of geen priemgetallen.")
        );


    }
}
