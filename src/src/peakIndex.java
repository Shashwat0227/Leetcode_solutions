public class peakIndex {
    public int peakIndexInMountainArray(int[] arr) {
        int temp =0;
        for(int i =1 ; i< arr.length -1;i++){
            if (arr[i-1]<arr[i]&&arr[i+1]<arr[i]){
                temp =i+0;
            }
        }
        return temp;
    }
}
