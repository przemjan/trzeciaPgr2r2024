public class Stringi {
    public static void main(String[] args) {
        String name = "Krzysztof";

        int dlugosc;
        dlugosc = name.length();

        char inicjal = name.charAt(0);

        String duze, male;

        name = name.toUpperCase();
        male = name.toLowerCase();

        System.out.println(name);
    }
}
