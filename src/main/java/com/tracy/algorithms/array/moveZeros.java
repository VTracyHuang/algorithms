package com.tracy.algorithms.array;

import java.util.Arrays;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/6/24 16:42
 */
public class moveZeros {
    public static void main(String[] args) {
        int [] nums = {0,3,5,0,1,0};
        System.out.println(Arrays.toString(moveZeros(nums)));
    }
    public static int [] moveZeros(int [] nums){
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[index++] = nums[i];
            }
        }
        for(int j = index; j <nums.length;j++){
            nums[j] = 0;
        }
        return nums;
    }
}
