public class SelectionSort {
    int[] array;
    int memPOS;
    public void selectionSort(int []arr){
        for(int i = 0;i<arr.length;i++){
            memPOS = i;
            for(int j = 0;j <arr.length;j++){
                if(arr[memPOS] > arr[j])
                memPOS = j;
            }
            
        }
    }
}
