public class butter_fly {
    public static void main(String args[]){
        int n = 5;

        for(int i=0;i<=n;i++){

            // first part
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            // for spaces 

            int spaces = 2*(n-i);
            for(int j=0;j<=spaces;j++){
                System.out.print(" ");
            }

            // second part

            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();

        }

        for(int i=n;i>=0;i--){

            // first part
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            // for spaces 

            int spaces = 2*(n-i);
            for(int j=0;j<=spaces;j++){
                System.out.print(" ");
            }

            // second part

            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();

        }


        
        
    }
}
