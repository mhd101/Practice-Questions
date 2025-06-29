import java.math.BigInteger;

public class GP {

    static final BigInteger MOD = BigInteger.valueOf(1000000007);

    public int nthTerm(int a, int r, int n){
        BigInteger base = BigInteger.valueOf(r);
        BigInteger power = base.modPow(BigInteger.valueOf(n-1), MOD); // r^(n-1) % MOD
        BigInteger nTerm = BigInteger.valueOf(a).multiply(power).mod(MOD); // a * power % MOD
        return nTerm.intValue();
    }

    public static void main(String[] args) {
        GP gp = new GP();
        int result = gp.nthTerm(2, 2, 4);
        System.out.println(result);
    }
}
