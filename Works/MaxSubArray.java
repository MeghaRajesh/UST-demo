import java.util.*;
public class MaxSubArray {
    static int findMax(int[] arr, int n,int k){
        int maxSum=0;
        for(int i=0;i<n-k+1;i++){
            int current=0;
            for(int j=0;j<k;j++){
                current=current+arr[i+j];
            }
            maxSum=Math.max(current, maxSum);
        }
        return maxSum;
    }


    static int SlidingWindow(int[] arr, int n,int k){
        int maxSum=0;
        
        for (int i = 0; i < k; i++) {
            maxSum+=arr[i];    
        }
        int windowSum=maxSum;
        for (int i = k; i < n; i++) {
            windowSum+=arr[i]-arr[i-k];
            maxSum=Math.max(maxSum, windowSum);
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int[] arr={1,2,6,2,4,1};
        System.out.println("Enter k:");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int result=SlidingWindow(arr,arr.length,k);
        int out=findMax(arr,arr.length,k);
        System.out.println(out);
    }
    
}
