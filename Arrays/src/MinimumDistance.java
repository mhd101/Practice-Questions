public class MinimumDistance {
    static int  minDist(int arr[], int x, int y){
        
        int ans = -1;
        int xi = -1, yi = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                xi = i;
                if(yi != -1){
                    if(ans == -1){
                        ans = Math.abs(xi-yi);
                    } else {
                        ans = Math.min(ans, Math.abs(xi-yi));
                    }
                }
            } else if (arr[i] == y){
                yi=i;
                if(xi != -1){
                    if(ans == -1){
                        ans = Math.abs(xi-yi);
                    } else {
                        ans = Math.min(ans, Math.abs(xi-yi));
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,3,2,5};
        System.out.println(minDist(arr, 2,3));
    }
}
