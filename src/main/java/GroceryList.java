import java.util.Arrays;

public class GroceryList {
    private String[] arr;

    public GroceryList() {
        this.arr = new String[10]; 
    }

    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
        }
    }
    public void remove(String item) {
        for (int i = 0;i < arr.length;i++) {
            if (arr[i] == item){
                for(int a = i;a<arr.length-i-1;a++){
                    arr[a] = arr[a+1];
                }
            }
        }
    }
    public String toString(){
         return (Arrays.toString(arr));//add arrayToString! Check the notes
    }
}
