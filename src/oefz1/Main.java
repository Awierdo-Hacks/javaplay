package oefz1;

public class Main {
    public static void main(String[] args) {
       Persoon p1 = new Persoon("Zaid", "12/02/1999", "Amsterdams");
        Persoon p2 = new Student("peter", "13/02/1999", "Amsterdamst", 10, "Klas 2");
        Persoon p3 = new KotStudent("hans", "14/02/1999", "Amsterdamstr", 10, "Klas 3", "handel");
       System.out.println(p1);
       System.out.println(p2);
       System.out.println(p3);




    }

}