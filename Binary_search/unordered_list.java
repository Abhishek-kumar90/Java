package Binary_search;

public class unordered_list {
    public static void main(String args[]){
        int[] arr = {-22,-21,1,2,3,4,5,6,7,8};
        int target = 5;
        int ans = check(arr,target);
        System.out.println(ans);

    }

    static int check(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAc = arr[start]<arr[end];
        // if(arr[start]<arr[end]){
        //     isAc = true;
        // }else{
        //     isAc = false;
        // }
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAc){
                if(target<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            
        }
        return -1;
    }
}
