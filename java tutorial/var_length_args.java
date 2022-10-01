/* variable length arguments means when we don't no how many 
 * inputs are given in the code.
 */



import java.util.*;
public class var_length_args {
    public static void main(String args[]){
        fun(1,2,3,44,5,6,77,88,89);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
//     }
    
// }

// import java.util.*;
// public class var_length_args{
//     public static void main(String args[]){
        fun("ak","bk","pk");

    }

    static void fun(String ...s){
        System.out.println(Arrays.toString(s));
    }

}
