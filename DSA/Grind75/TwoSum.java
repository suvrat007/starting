package Revision.Grind75;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int tgt=9;
        System.out.println(Arrays.toString(twoSum(nums,tgt)));
    }
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j]==target){
                    int[] arr = {i,j};
                    return arr;
                }
            }
        }
        return null;
    }
}

