import java.util.*;
public class input2d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[][] arr = { 
            /// already given input in array .
            {1,2,3,4},
            {3,4,5,6},
            {4,3,2,1}
        };

// when input is taking from the user....

        // for(int i=0;i<arr.length;i++){           
        //     for(int j=0;j<arr[i].length;j++){
             
        //         arr[i][j] = sc.nextInt();

        //         // System.out.println(arr);
        //     }
        // }

            for(int[] a : arr){
                System.out.println(Arrays.toString(a));   // for every print statement of array .
            }
            sc.close();

            // for(int i=0;i<3;i++){
            //     for(int j=0;j<arr[i].length;j++){
            //         System.out.print(arr[i][j]);
            // }
                // System.out.print(Arrays.toString(arr[i]));

            // System.out.println();
        // }

    }
}
