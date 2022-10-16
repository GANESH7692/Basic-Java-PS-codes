public class twoSumLeetCode{
    public static void main(String[] args){
        // this code is just for your reference!!
        int[] a = {1,2,3,4,5};
        int target = 9;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(target == a[i]){
                    System.out.println(i);
                }
                else if(a[i]+a[j]==target){
                    System.out.print(i+",");
                    System.out.print(j);
                    break;
                }
            }
        }
    }
}