
/*
scope means accesing variable only inside the function
 not outside the function
*/ 

public class scoping {
    public static void main(String args[]){
        int a = 10;
        // int b = 20;


        {
            a = 78; // already initialized outside the block in the same method,hence you cannot initilized .
            int c = 99;
            // values initialized in this block ,will remail in block 
            System.out.println(c);
        }

        System.out.println(a);


    } 

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
        
    }
}
