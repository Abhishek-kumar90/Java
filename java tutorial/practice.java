import java.util.*;
public class practice {
    // package function;

// public class question2 {
    public static void main(){
        odd();

    }

    static void odd(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
       for(int i=0;i<=n;i++){
            if(i%2==0){
                sum = sum+i;
            }
       }
       System.out.println(sum);
       sc.close();
       
    }
}
// }
