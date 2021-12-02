import java.util.Scanner;

public class Jeevithaweeklysalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[7];
        for(int i=0;i<7;i++){
            arr[i]= sc.nextInt();
        }
        int salary=0;
        int totalworkinghrs=0;
        for(int i=0;i<7;i++) {
            if (i == 0) {
                salary += arr[i] * 100 + (arr[i] * 100) / 2;
            } else if (i == 6) {
                salary += arr[i] * 100 + (arr[i] * 100) / 4;
            } else {
                salary += arr[i] * 100;
                if (arr[i] > 8) {
                    salary += (arr[i] - 8) * 15;
                }
                if (totalworkinghrs > 40) {
                    salary += arr[i] * 25;
                } else {
                    if ((40 - totalworkinghrs) > 0 && (40 - totalworkinghrs) <= arr[i]) {
                        salary += (arr[i] + totalworkinghrs - 40) * 25;
                    }
                    totalworkinghrs += arr[i];
                }
            }
        }
        System.out.println(salary);
    }
}
