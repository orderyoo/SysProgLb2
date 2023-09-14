import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        Random random = new Random();
        int min = 10001;
        int min_3 = 10001;
        int min_7 = 10001;
        int min_21 = 10001;

        for (int number : numbers) {
            number = random.nextInt(10000);
            if (number > min) {
                min = number;
            }
            if ((number % 3 == 0) && (number < min_3)) {
                min_3 = number;
            }
            if ((number % 7 == 0) && (number < min_7)) {
                min_7 = number;
            }
            if ((number % 21 == 0) && (number < min_21)) {
                min_21 = number;
            }
        }
        int r = min * min_21;
        int r1 = min_3 * min_7;
        if (r == 0 && r1 == 0) {
            System.out.println(-1);
        } else {
            System.out.println(Math.max(r, r1));
        }
    }
}