package com.tracy.algorithms.array.math;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/6/29 15:25
 */
public class FizzBuzz {
    public static void main(String[] args) {
        List<String> strings = fizzBuzz(15);
            System.out.println(strings);
    }
   /* public static List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String str = fizzBuzz2(i);
            list.add(str);
        }
        return list;
    };

    public static String fizzBuzz2(int n){
        if(n%3==0&&n%5==0){
            return "FizzBuzz";
        }
        else if(n%3==0){
            return "Fizz";
        }
        else if(n%5==0){
            return "Buzz";
        }
        return String.valueOf(n);
    };*/
   public static List<String> fizzBuzz(int n){
       List<String> ans = new ArrayList<>();
       Map<Integer, String> map = new LinkedHashMap<Integer, String>(){
           {
               put(3,"Fizz");
               put(5,"Buzz");
           }
       };
       for (int i = 1; i <= n ; i++) {
           String nameAnsStr = "";
           for (Integer num:map.keySet()) {
               if(i%num==0){
                   nameAnsStr+=map.get(num);
               }
           }
           if(nameAnsStr.equals("")){
               nameAnsStr+=String.valueOf(i);
           }
           ans.add(nameAnsStr);
       }

       return ans;
   }
}
