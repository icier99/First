package ru.mirea.tarasenko;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class threefour {
    public static void main(String[] args) {
        int firstnum;
        int[] numberArrayOne;
        int[] numberArrayTwo;
        int arrayLenght;

        System.out.println("Введите размер массивов");
        Scanner scan = new Scanner(System.in);
        arrayLenght = scan.nextInt();

        numberArrayOne = new int[arrayLenght];
        numberArrayTwo = new int[arrayLenght];
        Random random = new Random();

        for (int i = 0; i < numberArrayOne.length; i++) {
            numberArrayOne[i] = random.nextInt(-100, 100);
            numberArrayTwo[i] = random.nextInt(-100, 100);
        }

        Arrays.sort(numberArrayOne);
        Arrays.sort(numberArrayTwo);

        System.out.println(Arrays.toString(numberArrayOne));
        System.out.println(Arrays.toString(numberArrayTwo));

        /*
        for (int i = 0; i < numberArrayOne.length; i++) {
            for (int j = 0; j < numberArrayTwo.length; j++) {
                if (numberArrayOne[i] == numberArrayTwo[j]) {
                    System.out.print(numberArrayOne[i]);
                    System.out.print(" ");
                }
            }
        }
        */

        for (int i = 0; i < (numberArrayOne.length); i++) {
            firstnum = numberArrayOne[i];
            int low = 0;
            int high = numberArrayTwo.length;
            int middle;
            while (low <= high) {
                middle = (low + high) / 2;
                int num = numberArrayTwo[middle];
                if (num == firstnum) {
                    System.out.print(firstnum);
                    System.out.print(" ");
                    break;
                }
                else if (num > firstnum) {
                    high = middle - 1;
                }
                else {
                    low = middle + 1;
                }
            }
        }
    }
}
