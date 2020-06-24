package com.tracy.algorithms.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/6/24 17:13
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,5,3,6,7,8};
        System.out.println(Arrays.toString(TwoSum(nums,11)));
    }
    public static int[] TwoSum(int [] nums,int target){

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)&&map.get(complement)!=i){
               return new int []{i,map.get(complement)};
            }
        }

        return null;
    };
}
