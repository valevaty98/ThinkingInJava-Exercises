package executionControlChapter4;

import java.nio.Buffer;
import java.util.Random;

//Ex. 20
public class execControl {
//Ex. 23
    static void outputFibonachi(int number) {

        int[] nums = new int[number];

        for (int i = 0; i < number; i++) {
            if (i == 0 || i == 1) nums[i] = 1;
            else nums[i] = nums[i-1] + nums[i-2];
        }
        for (int i = 0; i < number; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    //Ex. 24
    static void findVampires() {
        int[] numeral = new int[4];
        for (int i = 1000; i < 10000; i++) {
            numeral[0] = i % 10000 / 1000;
            numeral[1] = i % 1000 / 100;
            numeral[2] = i % 100 / 10;
            numeral[3] = i % 10;

            if ( i == (numeral[0] * 10 + numeral[1]) * (numeral[2] * 10 + numeral[3]) ||
                    i == (numeral[1] * 10 + numeral[0]) * (numeral[2] * 10 + numeral[3]) ||
                    i == (numeral[0] * 10 + numeral[1]) * (numeral[3] * 10 + numeral[2]) ||
                    i == (numeral[1] * 10 + numeral[0]) * (numeral[3] * 10 + numeral[2]) ||
                    i == (numeral[0] * 10 + numeral[2]) * (numeral[1] * 10 + numeral[3]) ||
                    i == (numeral[0] * 10 + numeral[2]) * (numeral[3] * 10 + numeral[1]) ||
                    i == (numeral[2] * 10 + numeral[0]) * (numeral[1] * 10 + numeral[3]) ||
                    i == (numeral[2] * 10 + numeral[0]) * (numeral[3] * 10 + numeral[1]) ||
                    i == (numeral[0] * 10 + numeral[3]) * (numeral[1] * 10 + numeral[2]) ||
                    i == (numeral[0] * 10 + numeral[3]) * (numeral[2] * 10 + numeral[1]) ||
                    i == (numeral[3] * 10 + numeral[0]) * (numeral[1] * 10 + numeral[2]) ||
                    i == (numeral[3] * 10 + numeral[0]) * (numeral[2] * 10 + numeral[1]) ) {
                System.out.println(i + " is a Vampire");

            }

        }
    }
    public static void main(String[] args) {

        Random rand = new Random();
        int[] nums = new int[25];

        int i = 0;
        boolean isPrime;
        while (true) {
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
            if (i == 20) {
                break;
            }
        }
//Ex. 22
        char c = 'a';
        for (int k = 0; k < 5; k++) {
            switch (c) {
                case 'a':
                    System.out.println("aaa");
                    break;
                case 'b':
                    System.out.println("bbb");
                case 'c':
                    System.out.println("ccc");
                    break;
                default:
                    System.out.println("nothing");
            }
            c++;
        }
        outputFibonachi(7);
        System.out.println("-----------");
        findVampires();
    }


}
