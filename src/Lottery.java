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
        System.out.println("Виграшний білет: " + Arrays.toString(company));
        for (int j = 0; j < 7; j++) {
            if (company[j] == player[j]) {
                coincidence++;
            }
        }
        System.out.println("Білет гравця:    " + Arrays.toString(player));
        System.out.println("Кількість збігів: " + coincidence);
        if (coincidence > 4) {
            System.out.println("Гравець вийграв машину.");
        } else if (coincidence == 4) {
            System.out.println("Гравець вийграв 100 usd.");
        } else {
            System.out.println("Гравець програв.");
        }
    }
}
