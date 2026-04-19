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

        // Selection sort
        for (int i = 0; i < table.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < table.length; j++) {
                if (table[j] < table[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = table[i];
            table[i] = table[minIndex];
            table[minIndex] = temp;
        }

        System.out.println("\nAfter sorting:");
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }
    }
}