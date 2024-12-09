import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution{
	public static int[]  merge(int[] nums1, int n, int[] nums2, int m){
		int i = n;
		int j = 0; 

		while (i < nums1.length && j < nums2.length){
			nums1[i] = nums2[j];
			j += 1;
			i += 1;
		}
		return nums1;
	}
	
	public static void main(String[] args){
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int m = 3;
		int[] nums2 = {2, 5, 6};
		int n = 3;
		int[] output = new int[m + n];
		output = merge(nums1, n, nums2, m);
		System.out.println(Arrays.toString(output));
	}

}
