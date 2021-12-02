
import java.util.Arrays;
import java.util.Scanner;
public class rangeofarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int minelement=arr[0];
        int maxelement=arr[n-1];
        int ans=maxelement-minelement;
        System.out.println(ans);

    }
}
