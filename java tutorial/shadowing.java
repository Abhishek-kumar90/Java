/* shadowing is means two variable with the same name 
 * but scope of each varible is difffrent ya overlaping the scope of variables 
 * is called shadowing in java.
 */
// scope will begin when the value is initialize
public class shadowing{

    static int x = 90; // this will be shadow 
    public static void main(String args[]){
        System.out.println(x);

        int x = 40;
        System.out.println(x);

        fun();

       
        
        
    }

    static void fun(){
        System.out.println(x);
    }
}