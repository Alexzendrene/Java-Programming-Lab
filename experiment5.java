//Write a Java Code to implement each of the following sorting: Bubble Sort, Insertion Sort

public class experiment5 {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr [j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void insertionsort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        experiment5 sorts = new experiment5();
        int arr1[] = { 7, 3, 6, 4, 10, 1, 5, 2, 21 };
        int arr2[] = { 7, 3, 6, 4, 10, 1, 5, 2, 21 };
        sorts.printArray(arr1);
        sorts.printArray(arr2);
        sorts.bubbleSort(arr1);
        System.out.println();
        sorts.insertionsort(arr2);
        sorts.printArray(arr1);
        sorts.printArray(arr2);
    }
}
