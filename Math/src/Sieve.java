import java.util.ArrayList;
import java.util.Arrays;

public class Sieve {
    static ArrayList<Integer> sieve(int n) {
        int[] prime = new int[n+1];
        // fill all places with 1
        Arrays.fill(prime, 1);

        // create array list to store the result
        ArrayList<Integer> res = new ArrayList<>();

        // run loop from 2 to n 
        for(int i = 2; i <= n; i++){
            // check the index is equal to 1
            if(prime[i] == 1){
                for(int j = i * i; j <= n; j += i){ // mark all its multiple 0
                    prime[j] = 0;
                }
                res.add(i); // add the current index(i) to the result
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sieve(30));
    }
}
