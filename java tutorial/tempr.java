import java.util.*;
public class tempr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter temprature in c: ");
        Float tempc = sc.nextFloat();
        Float tempf = tempc*9/5+32;
        System.out.println(tempf);
        sc.close();

    }
}
