/*Write a function which takes in 2 numbers and returns the greater of those
two.*/

import java.util.*;
public class practice1 {
    public static void main(String args[]){
            greater();
    }

    static void greater(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n>m){
            System.out.print(n+"is greater number");
        } else if(m>n){
            System.out.print(m+"is greater number");
        } else{
            System.out.println("both numbers are equal");
        }
        sc.close();
    }
}
