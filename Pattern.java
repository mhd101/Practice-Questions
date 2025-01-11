public class Pattern {

    static void pattern1(int n){
        // no of rows
        for(int i=0; i < n; i++){
            // print stars
            System.out.println("* * * *");
        }
    }

    static void pattern2(int n){
        // no of rows
        for (int i = 0; i < n; i++) {
            // print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // new line
            System.out.println();
        }
    }

    static void pattern3(int n){
        // no of rows
        for (int i = 0; i < n; i++) {
            // print stars
            for (int j = i; j < n; j++){
                System.out.print("* ");
            }
            // new line
            System.out.println();
        }
    }

    static void pattern4(int n){
        // no of rows
        for(int i=1; i <= n; i++){
            // print stars
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            // new line
            System.out.println();
        }
    }
    // ***
    static void pattern5(int n){
        // no of rows
        for(int row = 0; row < 2 * n; row++){
            // no of rows
            int totalColsInRow = row > n ? 2 * n - row : row;
            // print stars
            for(int j = 0; j < totalColsInRow; j++){
                System.out.print("* ");
            }
            // new line
            System.out.println();
        }
    }

    static void pattern6(int n){
        // no of rows
        for(int i=0; i<n ; i++){
            // print spaces
            for(int j=0; j < n-i-1; j++){
                System.out.print(" ");
            }
            // print star
            for(int j=0; j < i+1; j++){
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }

    static void pattern7(int n){
        // no of rows
        for(int i = n; i > 0; i--){
            // print spaces
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            // print stars
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }

    static void pattern8(int n){
        // no of rows
        for(int i=0; i<n ; i++){
            // print spaces
            for(int j=0; j < n-i-1; j++){
                System.out.print(" ");
            }
            // print star
            for(int j=0; j < 2*i+1; j++){
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }

    static void pattern9(int n){
        // no of rows
        for(int i=n; i>0; i--){
            // print spaces
            for(int j=n; j > i; j--){
                System.out.print(" ");
            }
            // print stars
            for(int j=0; j < 2*i - 1; j++){
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }

    static void pattern10(int n){
        // no of rows
        for(int i=0; i<n; i++){
            // print spaces
            for(int j=0; j < n-i-1; j++){
                System.out.print(" ");
            }
            // print stars
            for(int j=0; j < i + 1; j++){
                System.out.print("* ");
            }
            // new line
            System.out.println();
        }
    }

    static void pattern11(int n){
        // no of rows
        for(int i=n; i>0; i--){
            // print spaces
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            // print stars
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            // new line
            System.out.println();
        }
    }

    static void pattern12(int n){
        // no of rows
        for(int i=n; i>0; i--){
            // print spaces
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            // print stars
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            // new line
            System.out.println();
        }
        // print rows from 6 to 10
        for(int i=0; i<n; i++){
            // print spaces
            for(int j=0; j < n-i-1; j++){
                System.out.print(" ");
            }
            // print stars
            for(int j=0; j < i + 1; j++){
                System.out.print("* ");
            }
            // new line
            System.out.println();
        }
    }
    // hint: use matrix i&j to solve
    static void pattern13(int n){
        // no of rows
        for(int i=0; i<n; i++){
            // no of columns
            for(int j=0; j < 2*n -1; j++){
                if(i+j == (n-1) || j-i == (n-1) || i == (n-1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            // new line
            System.out.println();
        }
    }

    static void pattern14(int n){
        // no of rows
        for(int i=0; i<n; i++){
            // no of columns
            for(int j=0; j < 2*n-1; j++){
                // condition
                if(i==0 || i == j|| i+j == 2*n-2 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            // new line
            System.out.println();
        }
    }

    static void pattern15(int n){
        // no of rows
        for(int i=0; i< 2*n-1; i++){
            // no of columns
            for(int j=0; j< 2*n-1; j++){
                // condition
                if(i+j == n-1 || i-j == n-1 || j-i == n-1 || i+j == 2*n+2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            // new line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(5); // full square
        System.out.println();
        pattern2(5); // right pyramid
        System.out.println();
        pattern3(5); // right down pyramid
        System.out.println();
        pattern4(5); // right numbered pyramid
        System.out.println();
        pattern5(5); // right arrow pyramid
        System.out.println();
        pattern6(5); // left pyramid
        System.out.println();
        pattern7(5); // left down pyramid
        System.out.println();
        pattern8(5); // triangle pyramid
        System.out.println();
        pattern9(5); // down triangle pyramid
        System.out.println();
        pattern10(5); // spaced triangle pyramid
        System.out.println();
        pattern11(5); // down spaced triangle pyramid
        System.out.println();
        pattern12(5); // spaced triangle pyramid combined
        System.out.println();
        pattern13(5);
        System.out.println();
        pattern14(5);
        System.out.println();
        pattern15(5);
    }


}