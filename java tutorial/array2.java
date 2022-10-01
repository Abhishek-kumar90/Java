import java.util.*;
public class array2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

            // System.out.print(arr[i]);
           
        }
        System.out.print(Arrays.toString(arr));
        sc.close();
    }
      
}

