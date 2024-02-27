public class Zmienne {
    public static void main(String[] args) {

        int liczba1;
        liczba1 = 1;
        double liczba2 = 4.9;

        System.out.println("Moja liczba: " + liczba1+ ".");

        liczba1 = (int)liczba2;

        System.out.println(liczba1);

        int days = 5;
        int hours = 8;
        int weeks = 52;

        int workHoursPerYear = days * hours * weeks;

        System.out.println(workHoursPerYear);

        System.out.println("Wynik: " + (5 + 8) );

        String napis = "Dzisiaj jest \"pięknie\"\n";

        napis += ".";

        System.out.println("Mój napis" +napis);
        System.out.print("Mój \tnapis" +napis +"\n");
        System.out.print("Mój napis" +napis);

        char znak = '#';

        boolean slonce = true; //false
    }
}
