import java.util.Scanner;
import java.lang.Math;

public class patterns {
    public static void main(String[] pattern) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pattern no: ");
        int patternNo = sc.nextInt();
        System.out.println("Enter the no.of rows: ");
        int n = sc.nextInt();

        patternPrinter(patternNo, n);

        sc.close();
    }

    public static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if ((row & 1) == 1) {
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if ((col & 1) == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == n - 1 && col == n - 1) {
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            if (row != n - 1) {
                for (int col = 1; col <= n; col++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                if (row == col)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                if (row == n || col == n || row == 1 || col == 1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
        int mid = ((n & 1) == 1)? n / 2 + 1: n / 2;
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                if (row == mid || col == mid)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                if (row == col || col == n - row + 1 || row == n - col + 1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n){
        for (int row = 1; row <= n; row++){
            for (int col = n - row + 1; col >= 1; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern12(int n){
        for (int row = 1; row <= n; row++){
            for (int sp = 1; sp <= n - row; sp++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern13(int n){
        for (int row = 1; row <= n; row++){
            for (int sp = 1; sp <= row - 1; sp++){
                System.out.print(" ");
            }
            for (int col = n - row + 1; col >= 1; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){
        for (int row = 1; row <= n; row++){
            for (int sp = 1; sp <= n - row; sp++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern15(int n){
        for (int row = 1; row <= n; row++){
            for (int sp = 1; sp < row; sp++){
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern16(int n){
        for (int row = 1; row <= n; row++){
            for (int sp = 1; sp <= n - row; sp++){
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern17(int n){
        for (int row = 1; row <= n; row++){
            for (int sp = 1; sp < row; sp++){
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * (n - row) + 1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern18(int n){
        for (int row = 1; row <= 2 * n - 1; row++){
            int times = (row <= n)? 2 * row - 1: (2 * (n - (row % n)) - 1);
            for (int sp = 1; sp <= Math.abs(n - row); sp++){
                System.out.print(" ");
            }
            for (int col = 1; col <= times; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern19(int n){
        for (int row = 1; row <= 2 * n - 1; row++){
            int spaces;
            int stars;
            if(row <= n){
                spaces = row;
                stars = 2 * (n - row) + 1;
            }
            else{
                spaces = (n - (row % n));
                stars = 2 * ((row % n) + 1) - 1;
            }
            for (int sp = 1; sp < spaces; sp++){
                System.out.print(" ");
            }
            for (int col = 1; col <= stars; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern20(int n){
	    for (int row = 1; row <= 2 * n - 1; row++){
		    int times = (row <= n)? row: (n - (row % n));
		    for (int col = 1; col <= times; col++){
			    System.out.print("*");
		    }
		    System.out.println();
	    }
    }

    public static void pattern21(int n){
	    for (int row = 1; row <= 2 * n - 1; row++){
		    int stars;
		    int spaces;
		    if(row <= n){
			    spaces = n - row;
			    stars = row;
		    }
		    else{
			    spaces = (row % n);
			    stars = n - (row % n);
		    }
		    for (int sp = 1; sp <= spaces; sp++){
			    System.out.print(" ");
		    }
		    for (int col = 1; col <= stars; col++){
			    System.out.print("*");
		    }
		    System.out.println();
	    }
    }

    public static void patternPrinter(int patternNo, int n) {
        switch (patternNo) {
            case 1 -> pattern1(n);
            case 2 -> pattern2(n);
            case 3 -> pattern3(n);
            case 4 -> pattern4(n);
            case 5 -> pattern5(n);
            case 6 -> pattern6(n);
            case 7 -> pattern7(n);
            case 8 -> pattern8(n);
            case 9 -> pattern9(n);
            case 10 -> pattern10(n);
            case 11 -> pattern11(n);
            case 12 -> pattern12(n);
            case 13 -> pattern13(n);
            case 14 -> pattern14(n);
            case 15 -> pattern15(n);
            case 16 -> pattern16(n);
            case 17 -> pattern17(n);
            case 18 -> pattern18(n);
            case 19 -> pattern19(n);
	    case 20 -> pattern20(n);
	    case 21 -> pattern21(n);
        }
    
    }
}
