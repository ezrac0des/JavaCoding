import java.util.Arrays;

public class PutZeroEndOFArray {
    public static void main(String[] args) {
        int result []={1,2,3,0,5,0,2,3};
        // [1,2,3,5,2,3,0,0];
        array(result);
        //[0, 2, 3, 0, 12, 0] put the zeros to the end.
        int arr[] = {0, 2, 3, 0, 12, 0};
        int brr[] = new int[arr.length];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                brr[idx] = arr[i];
                idx++;

            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));

    }

    public static void array(int arr[]){

        if(arr.length==0) return;
        int reverse[]=new int[arr.length];
        Arrays.sort(arr);
        int count=0;
        for (int i = arr.length-1; i>=0 ; i--) {
            reverse[count++]=arr[i];
        }
        System.out.println(Arrays.toString(reverse));

    }
    public static void secondWay(){
        //[0, 2, 3, 0, 12, 0] put the zeros to the end.
        int arr[] = {0, 2, 3, 0, 12, 0};
        int brr[] = new int[arr.length];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                brr[idx] = arr[i];
                idx++;

            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }
    }

