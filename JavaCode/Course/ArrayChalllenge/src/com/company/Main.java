package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

	// write your code here
        System.out.println("size of array:");
        int n=scanner.nextInt();
        System.out.println("Contents of array:");
        int[] myArray = getIntegers(n);
        System.out.println("sorted Array:");
        myArray = sortArray(myArray);
        printArray(myArray);
    }
    public static int[] getIntegers(int number){
        int[] array = new int[number];
        System.out.println("Type numbers for array \r");
        for(int i =0; i< number; i++){
            array[i] = scanner.nextInt();
        }
        return(array);
    }
    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static int[] sortArray(int[] unsorted){
        int[] sorted = unsorted;
        for(int i=0; i<unsorted.length-1; i++){
            int largest =i;
            for(int j=i+1; j<unsorted.length; j++){
                if(sorted[j]>sorted[largest]){
                    largest=j;
                }
            }
            sorted = swap(sorted, i, largest);
        }
        return sorted;
    }

    public static int[] swap(int[] ar, int one, int two){
        int[] swapped = ar;
        int temp = swapped[one];
        swapped[one] = swapped[two];
        swapped[two] = temp;
        return swapped;
    }

}
