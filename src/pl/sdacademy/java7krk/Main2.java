package pl.sdacademy.java7krk;

public class Main2 {
    public static void main(String[] args) {
        try {
                System.out.println(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("BRAK ARGUMENTOW PROGRAMU");
            System.out.println(e);
        }
    }
}
