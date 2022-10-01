/*. Write a function that takes in the radius as input and returns the
circumference of a circle. */

import java.util.*;
public class practice2 {
    public static void main(String args[]){
            circle();
    }

    static void circle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a radius: ");
        int r = sc.nextInt();

        System.out.println("circumference of a circle ="+2*3.14*r);
        sc.close();
    }
}
