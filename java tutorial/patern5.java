import java.util.*;
public class patern5 {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            // for this problem first divide two parts upper and lower and then solve....
            // first upper part.
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

        for(int j=1;j<=n-i;j++){
            System.out.print("*");
        }

            System.out.println();
            sc.close();
        
        }
    }
}
