package com.questions;


public class Question27_25_Allowance_to_Kunal {
    public static void main(String[] args) {
        int days=0;
        for (int i=1;i<32;i++){
            if (i%2==0){
                days++;
            }
        }
        System.out.printf("Numbers of Days Kunal is allowed to go is %d",days);

    }
}
