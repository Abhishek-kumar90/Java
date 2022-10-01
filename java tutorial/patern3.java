import java.util.*;
public class patern3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            //  for every row culumn is decrese one space

            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }
}
