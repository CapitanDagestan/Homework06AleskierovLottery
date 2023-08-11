import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        int[] company = new int[7];
        int[] player = new int[7];
        int coincidence = 0;
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            company[i] = random.nextInt(10);
            player[i] = random.nextInt(10);
        }
        Arrays.sort(company);
        Arrays.sort(player);
        System.out.print("Виграшний білет: ");
        for (int j = 0; j < 7; j++) {
            if (company[j] == player[j]) {
                coincidence++;
            }
            if (j != 6) {
                System.out.print(company[j] + " ");
            }
            if (j == 6) {
                System.out.println(company[j]);
            }
        }
        System.out.print("Білет гравця:    ");
        for (int k = 0; k < 7; k++) {
            if (k != 6) {
                System.out.print(player[k] + " ");
            }
            if (k == 6) {
                System.out.println(player[k]);
            }
        }
        System.out.println("Кількість збігів: " + coincidence);
    }
}
