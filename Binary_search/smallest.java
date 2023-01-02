package Binary_search;

public class smallest {
    public static void main(String args[]){
        char[] letter = {'a','b','c','d'};
        char target = 'b';
        char ans = find(letter,target);
        System.out.println(ans);

    }

    static char find(char[] letter, char target){
        int start =0;
        int end = letter.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<letter[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return letter[start % letter.length];

    }
}