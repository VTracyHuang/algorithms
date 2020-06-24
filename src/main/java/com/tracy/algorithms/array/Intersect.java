package com.tracy.algorithms.array;

import java.util.*;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/6/24 11:45
 */
public class Intersect {

    public static void main(String[] args) {
        int [] nums1 = {1,2,2,3,5};
        int [] nums2 = {2,2,3};
        System.out.println(Arrays.toString(intersect2(nums1,nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {

        //相当于找相同的游戏 ，A,B,C三个桶  A里面有的元素 做个统计  然后看B里面有没有A的元素 ，相同的放到C里面
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int l ;
        //首先遍历num1数组，确定有哪些元素，以及其出现的次数,存入map中
        for(int i : nums1){
            Integer count = map.get(i);
            count = count==null?1:++count;
            map.put(i,count);
        }
        //其次遍历num2数组，出现的元素，则对应map中的元素，并且map的计数减一，并且将这些元素加入到一个list中
        for(int i : nums2){
            Integer count = map.get(i);
            if(count!= null && count >0){
                list.add(i);
                map.put(i,--count);
            }
        }
        l = list.size();
        int [] res = new int [l];
        int i;
        //遍历list,存入数组，返回数组
        for(i = 0; i < l; ++i){
            res[i] = list.get(i);
        }
        return res;
    }
    public static int[] intersect2(int[] nums1, int[] nums2) {
        //双指针思想
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int p1 = 0,p2 = 0;
        while(p1 < nums1.length && p2 < nums2.length){
            if(nums1[p1] < nums2[p2]) p1++;
            else if(nums1[p1] > nums2[p2])  p2++;
            else{
                list.add(nums1[p1]);
                p1++;
                p2++;
            }
        }
        int [] internums = new int[list.size()];
        int i;
        for(i = 0; i<internums.length;++i)   internums[i] = list.get(i);
        return internums;
    }

}
