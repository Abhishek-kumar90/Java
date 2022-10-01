import java.util.Arrays;

// import javax.swing.UIDefaults.ProxyLazyValue;

public class passingfunc {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5};
        change(nums);
        System.out.println(Arrays.toString(nums));
    }   
    
    static void change(int[] arr){
        arr[0]=90;
    }
}
