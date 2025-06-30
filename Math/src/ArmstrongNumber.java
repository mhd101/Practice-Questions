public class ArmstrongNumber {
    static boolean armstrongNumber(int n){
        boolean flag = false;
        if( n >= 100 && n < 1000){
            int onesPlace = n % 10;
            int onesQuo = n / 10;
            int tensPlace = onesQuo % 10;
            int tensQuo = onesQuo / 10;
            int hundredPlace = tensQuo % 10;
            double amNumber = Math.pow(hundredPlace, 3) + Math.pow(tensPlace, 3) + Math.pow(onesPlace, 3);

            if((int)amNumber == n){
                flag = true;
            }

        }

        return flag ? true : false;
    }
    public static void main(String[] args) {
        System.out.println(armstrongNumber(100));
    }
}