package com.tracy.algorithms.array;

import java.util.Arrays;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/6/22 15:46
 */
public class RotateArray {

    public static void main(String[] args) {
        int [] nums = {-1,-100,3,99};
        System.out.println(Arrays.toString(rotate(nums,2)));
    }

    public static int [] rotate(int [] nums,int k){
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
        return nums;
    };
}
