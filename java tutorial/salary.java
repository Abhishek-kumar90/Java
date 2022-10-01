import java.util.*;
public class salary {
    public static void main(String args[]){
        System.out.print("enter a salary :");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();

        if(salary>10000){
            System.out.println("bonus of"+(salary+2000));
        } else{
            System.out.println("nothing😒");
        }
        sc.close();
    }
}
