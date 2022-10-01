import java.util.*;
public class nestedswitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int empid= sc.nextInt();
        String department = sc.next();

        switch (empid){
            case 1:
            System.out.println("abhishek");
            break;

            case 2:
            System.out.println("rahul");
            break;

            case 3:
            System.out.println("hello");

                switch(department){
                    case "it":
                        System.out.println("information");
                        break;

                    case "cse":
                    System.out.println("computer science");
                    break;

                    default:
                    System.out.println("enter valid department");
                }
                break;
            default:
            System.out.println("enter valid empid");
            sc.close();
        }
    }
}
