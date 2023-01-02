package Binary_search;
import java.util.*;
public class input_index {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int[] arr = new int[7];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int target = 5;

    }

    static int input(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(target>arr[mid]){
                start = mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
