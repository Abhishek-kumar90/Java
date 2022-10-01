import java.util.*;
public class lowercase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(1);

        if(ch>='a'&ch<='z'){
            System.out.println("lower case");
        } else{
            System.out.println("upper case");
        }
        sc.close();

    }
}
