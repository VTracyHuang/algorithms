package com.tracy.algorithms.array.math;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/6/29 15:48
 */
public class countPrimes {
    public static void main(String[] args) {
        int i = countPrimes(10);
        System.out.println(i);
    }
    public static int countPrimes(int n){
        int count = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < n/2; j++) {
                if(i%j == 0){

                }
            }
        }
        return count;
    }
}
