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

    public static void pattern22(int n){
        for (int row = 1; row <= n; row++){
            for (int sp = 1; sp <= n - row; sp++){
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row; col++){
                System.out.print((col <= row)? '*' : '#');
            }
            System.out.println();
        }
    }

    public static void pattern23(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                if (row == col || row == 1 || row == n || col == 1 || col == n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern24(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }

    public static void pattern25(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern26(int n){
        int a = 1;
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(a++);
            }
            System.out.println();
        }
    }

    public static void pattern27(int n){
        for (int row = 1; row <= n; row++){
            for (int sp = 1; sp <= n - row; sp++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }

    public static void pattern28(int n){
        for (int row = 1; row <= n; row++){
            for (int sp = 1; sp < row; sp++){
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }

    public static void pattern29(int n){
        int a = 1;
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                System.out.print(a++);
            }
            System.out.println();
        }
    }

    public static void pattern30(int n){
        for (int row = 1; row <= n; row++){
            int start = 1;
            for (int col = 1; col <= row; col++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void pattern31(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print((row == col)? 1: 0);
            }
            System.out.println();
        }
    }

    public static void pattern32(int n){
        char ch = 'A';
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    public static void pattern33(int n){
        char ch = 'A';
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }

    public static void pattern34(int n){
        for (int row = 1; row <= n; row++){
            char ch = 'A';
            for (int col = 1; col <= n; col++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    public static void pattern35(int n){
        char ch = 'A';
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }

    public static void pattern36(int n){
        char ch = 'A';
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    public static void pattern37(int n){
        for (int row = 1; row <= n; row++){
            char ch = 'A';
            for (int col = 1; col <= row; col++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    public static void pattern38(int n){
        char ch = 'A';
        for (int row = 1; row <= n; row++){
            for (int sp = 1; sp <= n - row; sp++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++){
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }

    public static void pattern39(int n){
        char ch = 'A';
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                if (col <= row){
                    System.out.print(col);
                }
                else{
                    System.out.print(ch);
                }
            }
            ch++;
            System.out.println();
        }
    }

    public static void pattern40(int n){
        char ch = 'A';
        for (int row = 1; row <= n; row++){
            for (int chs = 1; chs < row; chs++){
                System.out.print(ch++);
            }
            for (int col = 1; col <= n - row + 1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern41(int n){
        for (int row = 1; row <= n; row++){
            int start = ((row & 1) == 1)? 1: 0;
            for (int col = 1; col <= row; col++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void pattern42(int n){
        for (int row = 1; row <= n; row++){
            for (int sp = 1; sp <= n - row; sp++){
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++){
                System.out.print(row);
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
            case 22 -> pattern22(n);
            case 23 -> pattern23(n);
            case 24 -> pattern24(n);
            case 25 -> pattern25(n);
            case 26 -> pattern26(n);
            case 27 -> pattern27(n);
            case 28 -> pattern28(n);
            case 29 -> pattern29(n);
            case 30 -> pattern30(n);
            case 31 -> pattern31(n);
            case 32 -> pattern32(n);
            case 33 -> pattern33(n);
            case 34 -> pattern34(n);
            case 35 -> pattern35(n);
            case 36 -> pattern36(n);
            case 37 -> pattern37(n);
            case 38 -> pattern38(n);
            case 39 -> pattern39(n);
            case 40 -> pattern40(n);
            case 41 -> pattern41(n);
            case 42 -> pattern42(n);
        }
    
    }
}
