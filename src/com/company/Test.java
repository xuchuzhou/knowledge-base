package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
//       Solustion s =new Solustion();
//       /*
//        System.out.println(s.isPalindrome(121));
//        System.out.println(s.isPalindrome(12111));
//        */
//        int[] cost ={101,103,4,1,1,100,1,1,100,1};
////        System.out.println(s.minCostClimbingStairs(cost));
//
//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                int n = Integer.parseInt(br.readLine());
//                String[] strArr = br.readLine().trim().split(" ");
//                int[] arr = new int[n];
//                for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(strArr[i]);
//                Arrays.sort(arr);
//                for(int i = 0; i < n; i++) System.out.print(arr[i] + " ");
//        Scanner in =new Scanner(System.in);
//        int n = in.nextInt();
//        int[] nums = new int[n];
//        int[] max = new int[n];
//        int[] maxx = new int[n];
//        int x=0;
//        for(int i=0;i<n;i++) {
//            nums[i] = in.nextInt();
//        }
//        Arrays.sort(nums);
//        for(int i=0;i<n;i++) {
//            maxx[i] = nums[i];
//            while (maxx[i] != 0) {
//                max[i] = maxx[i] % 10;
//                maxx[i] = maxx[i] / 10;
//            }
//        }
//        for(int i = 0; i < n-1; i++) {
//             for (int j = 0;j<n-i-1;j++) {
//                 if (max[j] < max[j+1]) {
//                     x = nums[j];
//                     nums[j] = nums[j+1];
//                     nums[j+1] = x;
//                  }
//                 else if(max[j] == max[j+1]){
//                     if(nums[j]<nums[j+1]){
//                         x = nums[j];
//                         nums[j] = nums[j+1];
//                         nums[j+1] = x;
//                     }
//                 }
//                 }
//             }
//
//        for(int i = 0; i < n; i++){
//            System.out.print(nums[i]);
//        }


                for(int i=1;i<=4;i++){
                    for(int j=1;j<=4;j++){
                        for(int k=1;k<=4;k++){
                            //相互都不相等
                            if(i!=j&&i!=k&&j!=k){
                                System.out.println(100*i+10*j+k);
                            }
                        }
                    }
                }
            }
        }



