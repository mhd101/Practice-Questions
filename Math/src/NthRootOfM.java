public class NthRootOfM {
    public int nthRoot(int n, int m){
        if (n == 1) return m;

        int low = 1, high = m;

        while(low <= high){
            int mid = (low+high)/2;
            int pow = power(mid, n, m); // need to handle edge case of mid^n (overflow)
            if(pow == m){ 
                return mid;
            } else if(pow > m){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public int power(int mid, int n, int m){
        long result = 1;
        for(int i = 1; i <= n; i++){
            result *= mid;
            if (result > m) return mid; // handling overflow
        }
        return (int)result;
    }

    public static void main(String[] args) {
        NthRootOfM o = new NthRootOfM();
        System.out.println(o.nthRoot(2,9));

    }
}
