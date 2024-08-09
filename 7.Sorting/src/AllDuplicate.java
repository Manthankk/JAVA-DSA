import java.util.ArrayList;
import java.util.List;

//import static java.util.Collections.swap;

public class AllDuplicate {
    public List<Integer> AllDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
//                    swap(arr, i, correct);    it is there just it is showing red line so i have marked it
                } else {
                    i++;
                }
            }
            List<Integer> ans=new ArrayList<>();
            for(int index=0;index<arr.length;index++){
                if(arr[index] != index+1){
                    ans.add(index+1);
                }
            }
            return ans;

    }
            private static void swap(int[] arr, int first, int second) {
                int temp=arr[first];
                arr[first]=arr[second];
                arr[second]=temp;
        }
}
