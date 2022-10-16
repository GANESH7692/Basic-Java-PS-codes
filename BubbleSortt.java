import java.util.Arrays;
public class BubbleSortt{
    public static void main(String[] args) {
        int a[] = {8,2,6,4,9,5,0,1};
        BubbleSort(a);
        }
    static void BubbleSort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                if(a[j-1]>a[j]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }       
            }
        System.out.println(Arrays.toString(a)); 
    }
    }