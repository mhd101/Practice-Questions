public class AP {
    public static int nthTermOfAP(int a1, int a2, int n){
        int nth_term = a1 + (n-1)*(a2-a1);
        return nth_term;
    }
    public static void main(String[] args) {
        System.out.println(nthTermOfAP(2, 3, 4));
    }
}
