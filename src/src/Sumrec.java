public class Sumrec {
    public static void main(String[] args) {

        int[] arr = {2 ,4 ,15 ,15 ,15};
        int ans = calcSum(arr , 5);
        System.out.println(ans); // Ans is 51
    }

    public static int calcSum(int[] arr , int size ) {
    if ( size ==00){
        return 0;
    }if (size==1) return arr[0];
     int i =0;
    int RemainingSum = calcSum(arr,size-i);
    i++;
    int sum = arr[i]+RemainingSum;
    return sum;
    }
}
