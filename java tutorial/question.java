import java.util.*;
public class question {
    public static void main(String args[]){
            odd();
    }

    static void odd(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for(int i=0;i<=n;i++){
            if(i%2==1){
                sum = sum+i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
