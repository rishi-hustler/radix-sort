import java.util.Scanner;

// RISHI HUSTLER

public class RadixSort {

    // Get maximum value in array
    static int getMax(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    // Counting sort based on digit represented by exp
    static void countSort(int[] arr, int n, int exp) {
        int[] output = new int[n];
        int[] count = new int[10];

        // Store count of occurrences
        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // Change count[i] to contain actual position
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build output array (stable sort)
        for (int i = n - 1; i >= 0; i--) {
            int index = (arr[i] / exp) % 10;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }

        // Copy output to original array
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // Radix sort function
    static void radixSort(int[] arr, int n) {
        int max = getMax(arr, n);

        // Apply counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

    // Print array
    static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- RADIX SORT PROGRAM ---");
            System.out.println("1. Sort an Array");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of elements: ");
                    int n = sc.nextInt();

                    int[] arr = new int[n];
                    System.out.println("Enter elements (non-negative integers):");
                    for (int i = 0; i < n; i++)
                        arr[i] = sc.nextInt();

                    System.out.print("Original Array: ");
                    printArray(arr);

                    radixSort(arr, n);

                    System.out.print("Sorted Array: ");
                    printArray(arr);
                    break;

                case 2:
                    System.out.println("Program terminated.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
