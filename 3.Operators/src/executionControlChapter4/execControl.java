package executionControlChapter4;

import java.nio.Buffer;
import java.util.Random;

//Ex. 18
public class execControl {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] nums = new int[25];

        int i = 0;
        boolean isPrime;
        while (i < 20) {
            nums[i] = rand.nextInt(100) + 3;
            isPrime = true;
            for (int j = 2; j < nums[i] / 2 + 1; j++) {
                if (nums[i] % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) System.out.println(nums[i] + " is prime");
            else System.out.println(nums[i] + " isn't prime");
            i++;
        }


    }


}
