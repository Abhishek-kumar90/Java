import java.util.*;
public class strarry {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String[] str = new String[5];

        for(int i = 0;i<str.length;i++){
            str[i]=sc.next();
            str[1]="kunal";
        }
        System.out.println(Arrays.toString(str));

        /// we can now modify the index string 
        // str[1]="abhishek";

        // System.out.println(Arrays.toString(str));
        sc.close();

    }
}
