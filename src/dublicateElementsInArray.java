import java.util.*;

/**
 * ramazan
 * Write code to filter duplicate elements from an array and print as a list?
 */

public class dublicateElementsInArray {


    public static void main(String[] args) {

        String[] array = new String[]{"dog", "dog", "cat", "car", "car"};

        Set<String> set = new HashSet<>(Arrays.asList(array));
        System.out.println(set);


        word(array);
    int slow=0;
    int fast=1;
        // dog,cat,car
      List<String> result = new ArrayList<>();
        for (int i = 0; i < array.length-1; i++) {
            if(array[slow].equals(array[fast])){
                slow++;
               result.add(array[slow]);
            }else{
                fast++;
            }
        }

        System.out.println((slow));
        System.out.println((fast));
        System.out.println(result);


    }

    public static void word(String[] ar){
   List<String>list=new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (!ar[i].equals(ar[j])) {
                    list.add(ar[i]);
                }
            }
        }
        System.out.println(list);


    }

    }