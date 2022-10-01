// import java.util.*;
public class overloading {
    public static void main(String args[]){
        fun(30);
        fun("abhishek gupta");
        sum(2,3);
    }

    static int sum(int a,int b){
        return a+b;
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
    
}
