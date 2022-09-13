package com.company;

import static java.lang.Math.min;

class Solustion {
    public boolean isPalindrome(int x) {
        int a = 0;
        int b = x;
        if(x < 0){
            return false;
        }
        else if(x > 0){
            while(x != 0){
                a = a * 10 + x % 10;
                x=x/10;
            }

        }
        System.out.println(a);
        if(a == b){
            return true;
        }
        else{
            return false;
        }

    }
//              101,100,1
    /*
                     101,100,1,1,1,100,1,1,100,1
                 i=2  next=min(100,101)=100  prev=0，curr=100，
                 i=3  next=min(100+1,0+100)=100 prev=100,curr=100
                 i=4     100,101
     */


        public int minCostClimbingStairs(int[] cost) {
            int prev = 0, curr = 0,costSize=cost.length;

            for (int i = 2; i <= costSize; i++) {
                int next = min(curr + cost[i - 1], prev + cost[i - 2]);
                prev = curr;
                curr = next;
            }
            return curr;
        }
    }
