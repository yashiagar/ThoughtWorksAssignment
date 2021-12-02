import java.util.Scanner;

public class uppertriangularmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean isuppertriangular = true;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i][j] != 0) {
                    isuppertriangular = false;
                    break;
                }
            }
            if (!isuppertriangular) {
                break;
            }
        }
        if (isuppertriangular) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
