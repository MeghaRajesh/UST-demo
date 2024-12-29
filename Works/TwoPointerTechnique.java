public class TwoPointerTechnique {
    public static boolean targetSumUsual(int [] arr,int target){
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean TwoPointer(int[] arr,int target){
        int leftPointer=0;
        int rightPointer=arr.length-1;
        while(leftPointer<rightPointer){
            int sum=arr[leftPointer]+arr[rightPointer];
            if(sum==target){
                return true;
            }
            else if(sum<target){
                leftPointer++;
            }
            else{
                rightPointer--;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=12;
        if(TwoPointer(arr,target)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No"); 
        }
    }
    
}
