/*Write a function that takes in age as input and returns if that person is eligible
to vote or not. A person of age > 18 is eligible to vote.
 */

import java.util.*;
public class practice3 {
    public static void main(String[] args) {
            vote();
    }

    static void vote(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=18){
            System.out.println("eligible to vote");
        } else{
            System.out.println("not eligible");
        }
        sc.close();
    }
}
