import java.util.Scanner;

public class collatzsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int length=0;
        while(n!=1){
            System.out.println(n);
            if(n%2!=0) {
                n = 3 * n + 1;
            }
            else {
                n = n / 2;
            }
            length++;
        }
        System.out.println(n);
        System.out.println(length);
    }
}
