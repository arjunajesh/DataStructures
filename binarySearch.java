public class binarySearch {
    public static int binarySearch(int key, int[] arr){
        if(arr.length==0) return -1;
        int l = 0;
        int h = arr.length - 1;
        while(l <= h){
            int mid = l + (h-l)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key > arr[mid]){
                l = mid + 1; 
            }
            else{
                h = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,5,8,10,12,16,17};
        System.out.println(binarySearch(12,nums));
    }
}
