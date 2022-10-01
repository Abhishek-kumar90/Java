// import java.util.*;
// public class maximum {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if(a>b){
//             if(a>c){
//                 System.out.println(a+" is greater number");
//             }

//         } else if(b>c){
//             if(b>a){
//                 System.out.println(b+" is greater number");
//             }

//         } else{
//             System.out.println(c+"is greater number");
//         }

//     }
// }


import java.util.*;
public class maximum{
    public static void main(String args[]){
       max();

    }

    static void max(){
     Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if(a>b){
                if(a>c){
                    System.out.println(a+"is greater number");
                }

            }else if(b>a){
                if(b>c){
                    System.out.println(b+"is greater number");

                }

            }else{
                System.out.println(c+"is greater number");
            }

            in.close();
            
        }
       
       
    }


