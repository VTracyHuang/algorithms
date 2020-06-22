package com.tracy.algorithms.dp;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/6/22 11:14
 */
public class FrogJump {
    public static void main(String[] args) {

    }
    public static boolean canJump(int [] A){

        int n = A.length;
        boolean [] f = new boolean[n+1];
        
        f[0] = true;

        int i,j;
        for ( j = 0; j < n; ++j) {
            f[j] = false;
            for (i = 0; i < j; ++i) {
                if(f[i] && i+A[i] >=j){
                    f[j] = true;
                    break;
                }
            }
        }
        return f[n-1];
    };
}
