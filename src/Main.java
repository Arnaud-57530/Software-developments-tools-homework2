import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] table = new int[5];
        Random rand = new Random();

       
        for (int i = 0; i < table.length; i++) {
            table[i] = rand.nextInt(100);
        }

        System.out.println("Before sorting:");
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }

        for (int i = 0; i < table.length - 1; i++) {
            for (int j = 0; j < table.length - 1 - i; j++) {
                if (table[j] > table[j + 1]) {
                    int temp = table[j];
                    table[j] = table[j + 1];
                    table[j + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter sorting:");
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }
    }
}