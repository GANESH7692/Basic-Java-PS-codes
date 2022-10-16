import java.util.Scanner;

public class SearchInsertPositionLeetCode{
    // this code is just for your reference!!
    public static void main(String[] args) {
        int[] nums = {1,10,15,20};
        int target = 11 ;
        
        for(int i=0;i<nums.length;i++){
            if(target<nums[i]){
                System.out.println(i);
                break;
            }
            else if(target>nums[nums.length-1]){
                System.out.println(nums.length-1);
                break;
            }
        }
    }
}