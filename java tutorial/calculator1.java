// import java.util.*;
// public class calculator1 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String fruit = sc.next();
//         switch (fruit){
//             case "apple":
//             System.out.println("a sweet fruit");
//             break;

//             case "mango":
//             System.out.println("king of fruits");
//             break;
//             case "orange":
//             System.out.println("mst fruits");
//             break;

//             case "grapes":
//             System.out.println("small fruits");
//             break;
 

//             default:
//             System.out.println("none");

//         }
//     }
// }


import java.util.*;
public class calculator1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        switch (day){
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");

            case 3:
            System.out.println("wednesday");
            break;

            case 4:
            System.out.println("thrusday");
            break;

            case 5:
            System.out.println("friday");
            break;

            case 6:
            System.out.println("saturday");
            break;

            case 7:
            System.out.println("sunday");
            break;

            default:
            System.out.println("please enter a valid number");


        }
        sc.close();
    }
    
}