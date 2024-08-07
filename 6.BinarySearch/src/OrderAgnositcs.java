public class OrderAgnositcs {
    public static void main(String[] args) {
        int[] arr={-18,-4,-1,0,2,4,8,10,40};
        int target=-1;
        int ans=orderAgnostics(arr,target);
        System.out.println(ans);
    }
    static int orderAgnostics(int[] arr,int target){
        int start=0;

        int end=arr.length-1;

        boolean isAsc=arr[start]<arr[end];

        while(start <=end){
            int mid=start+(end-start)/2;
            if(target <arr[mid]){
                end=mid-1;
            }
            else if(target> arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
            if (isAsc){
                if(target < arr[mid]){
                    end=mid-1;
                }else {
                    start=mid-1;
                }
            }else {
                if (target> arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
