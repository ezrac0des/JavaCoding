import java.util.Arrays;

public class ArrayMax2 {
    public static void main(String[] args) {
        int arr[] = {12, 23, 34, 45, 56, 3, 4};
    }

    public static void arrayMax(int[] arr) {
        int biggest = 0;
        int biggest2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (biggest < arr[i]) {
                biggest2 = biggest;
                biggest = arr[i];
            } else if (arr[i] > biggest2) {
                biggest2 = arr[i];
            }
        }
        System.out.println(biggest);
        System.out.println(biggest2);
    }

    public static void arrayMax2(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[arr.length - 2]);
    }

    public static void arrayMax3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
