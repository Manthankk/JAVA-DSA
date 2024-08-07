//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {-3,-5,-6,-9,0,3,5,7,33,66,77,222};
        int target=77;
        int ans=binarySearch(arr,target);
        System.out.println(ans);

        }
        static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start <=end){
            int mid=start+(end-start)/2;

            if(target< arr[mid]){
                end=mid-1;
            }
            else if(target> arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;

        }

    }
