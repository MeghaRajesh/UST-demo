public class CountSoryAlgorithm {
    public static int[] countSort(int[] inputArray){
        int len=inputArray.length;
        int max=0;
        for(int i=0;i<len;i++){
            max=Math.max(max,inputArray[i]);
        }
        int[] countArray=new int[max+1];
        //store frequency
        for(int i=0;i<len;i++){
            countArray[inputArray[i]]++;

        }

        for (int i =1; i <=max; i++) {
            countArray[i]+=countArray[i-1];
            
        }
        int[] outputArray=new int[len];
        for (int i = len-1; i >=0; i--) {
            outputArray[countArray[inputArray[i]]-1]=inputArray[i];
            countArray[inputArray[i]]--;
            
        }
        return outputArray;

    }
    public static void main(String[] args) {
        int[] inputArray={2,6,9,0,2,4,1,6};
        int[] outputArray=countSort(inputArray);
        for (int el:outputArray){
            System.out.println(el+",");
        }
    }
    
}
