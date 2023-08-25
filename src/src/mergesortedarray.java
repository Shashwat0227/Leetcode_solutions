import java.util.*;
public class mergesortedarray {

        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int j =0;
            for (int i =0 ; i < m ;i++){
                nums1[j]=nums1[i];
                j++;
            }
            for(int i =0 ; i <nums2.length; i++){
                nums1[j]=nums2[i];
                j++;

            }
            Arrays.sort(nums1);
        }



    }

