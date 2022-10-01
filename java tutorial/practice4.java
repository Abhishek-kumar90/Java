/*7. Write a program to enter the numbers till the user wants and at the end it
should display the count of positive, negative and zeros entered.
 */

import java.util.*;
public class practice4 {
    public static void main(String[] args) {
            count();
    }

    static void count(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        for(int i=0;i<=n;i++){
            count = count+i;
            System.out.println(count);
            // int n =sc.nextInt();
        }
    }
}
