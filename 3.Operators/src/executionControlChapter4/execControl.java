package executionControlChapter4;

import java.nio.Buffer;
import java.util.Random;

//Ex. 17
public class execControl {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] nums = new int[25];

        nums[0] = rand.nextInt(100);
        System.out.println(nums[0]);

        int i = 1;
        while (true) {
            nums[i] = rand.nextInt(100);
            System.out.print(nums[i] + " ");
            if (nums[i] > nums[i - 1]) {
                System.out.println("more");
            } else {
                System.out.println("less");
            }
            if (i < 24) i++;
            else i = 1;
        }
    }


}
