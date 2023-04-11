public class InterviwewCoding {
    public static void main(String[] args) {

/*
In case of an Armstrong number of 3 digits,
the sum of cubes of each digits is equal to the number itself.
 For example: 153 = 1^3 + 5^3 + 3^3 =153
 */

  int number=153;
   String secondWay=String.valueOf(number);
   String rep=secondWay.replace(secondWay,"");
    int sum=0;
        for (int i = 0; i <rep.length(); i++) {
            int df=number%10;
            number=df/10;
        int temp= (int) Math.pow(Integer.parseInt(rep),rep.length());
            System.out.println(temp);
         sum=temp+sum;
            System.out.println(sum);
        }
        System.out.println(sum);

         if (sum!=number){
             System.out.println("is not equal");
         }else{
             System.out.println("equal");
         }

    }
}
