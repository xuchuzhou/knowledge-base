package com.company;

public class Test {
    public static void main(String[] args) {
       Solustion s =new Solustion();
       /*
        System.out.println(s.isPalindrome(121));
        System.out.println(s.isPalindrome(12111));
        */
        int[] cost ={1,100,1,1,1,100,1,1,100,1};
        System.out.println(s.minCostClimbingStairs(cost));
    }


}
