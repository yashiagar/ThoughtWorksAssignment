import java.util.Scanner;

public class lowertriangularmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int islower=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                if(j > i && arr[i][j] != 0) {
                    islower = 0;
                }
            }
        }
        if(islower==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
