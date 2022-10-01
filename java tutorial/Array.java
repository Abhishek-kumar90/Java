import java.util.*;
public class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];/// declare the how many times array will run.
        // arr[0]=23;
        // arr[1]=89;
        // arr[2]=34;
        // arr[3]=9;
        // arr[4]=8;

        // this is how going to internally work on array

        // System.out.println(arr[2]);

        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();
            // System.out.print(arr[i] +" ");

        for(int num : arr){
            System.out.print(num +" ");
        }



        }
        sc.close();

            // System.out.println(arr[i]);
    }
}