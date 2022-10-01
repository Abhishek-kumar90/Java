import java.util.*;
public class natural{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();

        // int sum = sc.nextInt();
        // int a =sc.nextInt();

        for(int i=1;i<=n;i++){
            sum = sum+i;
        }
        System.out.print(sum);
        sc.close();
    }
}
