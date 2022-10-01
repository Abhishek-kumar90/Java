import java.util.*;
public class user_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int number[] = new int[n];

        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }


        int x = sc.nextInt(); // for compare all the input 
        for(int i=0;i<number.length;i++){ // length is size of array
            if(number[i]==x){
                System.out.println("x is found at index :"+i);
            }
        }
        sc.close();


    }
}
