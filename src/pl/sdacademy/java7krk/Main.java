package pl.sdacademy.java7krk;

public class Main {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
