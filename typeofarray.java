import java.util.Scanner;

public class typeofarray {
    static int type(int[] arr, int n){
        int counteven=0;
        int countodd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                counteven++;
            }
            else{
                countodd++;
            }
        }
        if(counteven==n){
            return 1;
        }
        else if(countodd==n){
            return 2;
        }
        else{
            return 3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int ans=type(arr,n);
        if(ans==1) {
            System.out.println("Even");
        }
        else if(ans==2){
            System.out.println("Odd");
        }
        else{
            System.out.println("Mixed");
        }
    }
}
