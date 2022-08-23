package com.company;

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
}