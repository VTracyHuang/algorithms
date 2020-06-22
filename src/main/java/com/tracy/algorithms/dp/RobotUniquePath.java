package com.tracy.algorithms.dp;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/6/22 10:19
 */
public class RobotUniquePath {

    public static void main(String[] args) {
        System.out.println( uniquePath(2,3));
    }


    public static int uniquePath(int m,int n){

        int [][] f = new int[m][n];

        f[0][0] = 1;

        int i,j;
        for (i = 0; i < m; ++i) {
            for ( j = 0; j < n; ++j) {
                if(i==0 || j==0){
                    f[i][j] = 1;
                }else {
                    f[i][j] = f[i-1][j] + f[i][j-1];
                }
            }
        }

        return f[m-1][n-1];
    };
}
