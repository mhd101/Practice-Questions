public class AddTwoFractions {
    static void addFraction(int num1, int den1, int num2, int den2) {

            if (den1 != den2) {
                int num = (den2 * num1) + (den1 * num2);
                int den = (den1 * den2);
                int gcd = findGCD(num,den);
                num /= gcd;
                den /= gcd;
                System.out.println(num + "/" + den);
            } else {
                int num = num1 + num2;
                int den = den1;
                int gcd = findGCD(num,den);
                num /= gcd;
                den /= gcd;
                System.out.println(num + "/" + den);
            }
            
    }
    
    static int findGCD(int a, int b){
        if(b==0){
            return a;
        }
        return findGCD(b, a%b);
    }

    public static void main(String[] args) {
        addFraction(384, 887, 778, 916);
    }
}
