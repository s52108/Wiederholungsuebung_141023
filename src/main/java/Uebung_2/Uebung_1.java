package Uebung_2;

import java.util.Arrays;

public class Uebung_1 {

    public static void main(String[] args) {
        int[] arr1 = {6, 10, 1000, 80, 50, 5, 7, 3, 2, 1, 15};
        int[] arr2 = {6, 10, 1000, 80, 50, 5, 7, 3, 2, 1, 15};

        // Sortiere dieses Array (Verwende dafür die sort() Funktion)
        Arrays.sort(arr1);
        printArray(arr1);

        // Sortiere dieses Array (Verwende dafür die nicht sort() Funktion)
        bubbleSort(arr2);
        printArray(arr2);
    }

    // Funktion die ein Array ausgibt und wo man das Array übergibt
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Bubble Sort Funktion
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}