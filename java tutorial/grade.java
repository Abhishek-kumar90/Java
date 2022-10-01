import java.util.*;
public class grade{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=91 & n<=100){
            System.out.println("AA");
        }else if(n>=81 & n<=90){
            System.out.println("AB");
        }else if(n>=71 & n<=80){
            System.out.println("BB");
        }else if(n>=61 & n<=70){
            System.out.println("BC");
        }else if(n>=51 & n<=60){
            System.out.println("CD");
        }else if(n>=41 & n<=50){
            System.out.println("DD");
        }else if(n>100){
            System.out.println("please enter a valid number");
        }else{
            System.out.println("fail");
        }
        sc.close();
    }
}