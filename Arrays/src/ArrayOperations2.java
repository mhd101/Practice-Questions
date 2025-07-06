// Using Java Collection
import java.util.ArrayList;

public class ArrayOperations2 {
    static boolean searchEle(ArrayList<Integer> arr, int x){
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == x){
                return true;
            }
        }
        return false;
    }

    static boolean insertEle(ArrayList<Integer> arr, int y, int yi){
        arr.add(yi, y);
        if(arr.get(yi) == y){
            return true;
        } else {
            return false;
        }
    }

    static boolean deleteEle(ArrayList<Integer> arr, int z){
        if(arr.contains(z)){
            arr.remove(Integer.valueOf(z));
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(17);
        list.add(15);
        list.add(8);
        list.add(9);
        list.add(12);
        System.out.println(searchEle(list, 19));
        System.out.println(insertEle(list, 6, 2));
        System.out.println(deleteEle(list, 5));
    }
}
