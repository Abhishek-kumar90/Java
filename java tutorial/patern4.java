import java.util.*;
public class patern4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            // for every number in culumn is incremet is next number of previous number.

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
            sc.close();
        }

    }
}
