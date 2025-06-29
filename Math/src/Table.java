import java.util.ArrayList;

public class Table {
    static ArrayList<Integer> getTable(int n) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            int res = n * i;
            arr.add(res);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(getTable(5));
    }
}

