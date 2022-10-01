import java.util.*;
public class userinput_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array");
        int n = sc.nextInt();
        int number[] = new int[n];

        // for input

        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }
        System.out.println("output for this input");
        // for output 
        for(int i=0;i<n;i++){
            System.out.println(number[i]);
        }
        sc.close();
    }
}
