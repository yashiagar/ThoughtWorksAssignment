package com.tw.firstprogram;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc =new Scanner(System.in);
        int row=sc.nextInt();
        int col =sc.nextInt();
        int n= sc.nextInt();
        if(n>=1 && n<=col){
            System.out.println("Yes");
            return;
        }
        if ((n%row==1) || ( n%col==0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

}
