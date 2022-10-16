public class BinarySearchh{
    static int BinarySearch(int a[], int target){
        int start = 0;
        int end = a.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(a[mid]==target){
                return mid;
            }
            if(target < a[mid]){
                end = mid-1;
            }
            if(target > a[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int target = 5;
        System.out.println(BinarySearch(a,target));
    }
}