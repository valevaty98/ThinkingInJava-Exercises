package executionControlChapter4;

import java.util.Random;

//Ex. 2
public class execControl {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] nums = new int[25];

        nums[0] = rand.nextInt(100);
        System.out.println(nums[0]);
        
        for (int i = 1; i < 25; i++) {
            nums[i] = rand.nextInt(100);
            System.out.print(nums[i] + " ");
            if (nums[i] > nums[i - 1]) {
                System.out.println("more");
            } else {
                System.out.println("less");
            }
        }
    }


}
