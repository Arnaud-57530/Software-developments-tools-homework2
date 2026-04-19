import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] table = new int[5];
        Random rand = new Random();

        for (int i = 0; i < table.length; i++) {
            table[i] = rand.nextInt(100); // valeurs entre 0 et 99
        }

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }
    }
}