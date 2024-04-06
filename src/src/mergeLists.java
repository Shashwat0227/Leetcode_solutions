import java.util.*;
public class mergeLists {
    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    static int[] mergeKLists(ListNode[] lists) {
        int count =0;
        for (ListNode i:lists){
            ListNode curr = i;
            while (curr!=null){
                count++;
                curr = curr.next;
            }
        }
        int k = 0;
        int []arr = new int[count];
        for (ListNode i :lists){
            ListNode temp = i;
            while (temp!=null){
                arr[k]=temp.val;
                temp = temp.next;
                k++;
            }
        }
        Arrays.sort(arr);
//        int j =1;
//        ListNode res = new ListNode(arr[0]);
//        while (j<=arr.length){
//            res.next.val = arr[j];
//            j++;
//            res.next = res.next.next;
//        }
//
//        return res;
        return arr;
    }

    public static void main(String[] args) {

    }
}
