import java.util.*;
public class table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = sc.nextInt();
        for(int i=1;i<11;i=i+1){
            System.out.println(a*i);
        }
        sc.close();
    }
}


