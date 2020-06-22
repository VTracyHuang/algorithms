package com.tracy.algorithms.dp;

import sun.nio.cs.ext.MacThai;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/6/22 17:05
 */
public class ClimbStairs {
    public static void main(String[] args) {
        int [] A = {1,2};
        System.out.println(countStairs(A,2));
    }

    public static int countStairs(int [] A,int M){

        int [] f = new int [M+1];

        f[0] = 0;
        int n = A.length;

        int i,j;
        for(i = 1;i <= M; ++i){

            f[i] = Integer.MAX_VALUE;

            for(j = 0;j < n; ++j){

                if(i >= A[j] && f[i-A[j]] != Integer.MAX_VALUE ){

                    f[i] = Math.min(f[i - A[j]] + 1,f[i]);
                }

            }
        }

        if(f[M] == Integer.MAX_VALUE){
            return -1;
        }

        return f[M];
    };
}
