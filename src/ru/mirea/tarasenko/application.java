package ru.mirea.tarasenko;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class application {
    public static void sort(int[] numberArray, int numToFind) {
        int numI = 1;
        int low = 0;
        int high = numberArray.length;
        int middle;
        while(low <= high) {
            System.out.println(numI);
            middle = (low + high) / 2;
            int num = numberArray[middle];
            if(num == numToFind){
                System.out.println("Значение найдено под индексом "+middle);
                return;
            } else if(num > numToFind){
                high = middle - 1;
                numI ++;
            } else {
                low = middle + 1;
                numI ++;
            }
        }
        System.out.println("Искомого значения в массиве нет");
    }


    public static void main(String[] args){
        int[] numberArray;
        int arrayLenght;
        int numToFind;

        System.out.println("Введите размер массива");
        Scanner scan = new Scanner (System.in);
        arrayLenght  = scan.nextInt();

        numberArray = new int[arrayLenght];
        Random random = new Random();

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt (-100, 100);
        }
        Arrays.sort(numberArray);
        System.out.println(Arrays.toString(numberArray));
        System.out.println("Введите число для поиска:");
        numToFind = scan.nextInt();

        sort(numberArray, numToFind);
    }
}