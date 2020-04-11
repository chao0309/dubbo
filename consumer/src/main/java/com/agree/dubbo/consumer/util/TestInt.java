package com.agree.dubbo.consumer.util;

import java.util.ArrayList;
import java.util.Scanner;

public class TestInt {
    public static void main(String[] args){
//        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
        String str = "0x76E";
        System.out.println(get(str));
    }

    private static int get(String str){
        String new_str = str.substring(2,str.length());
        double t = 0;
        int len = new_str.length();
        for(int i = len-1;i>=0;i--){
            if(!Character.isDigit(new_str.charAt(i))){
                int t1 = getNum(new_str.charAt(i));
                t = t + t1*(Math.pow(16,len-1-i));
            }else{
                char c = new_str.charAt(i);
                int t2 = Integer.parseInt(c+"");
                t = t + t2*(Math.pow(16,len-1-i));
            }
        }
        String ttt = String.valueOf(t);

        return Integer.parseInt(ttt);
    }

    private static int getNum(char number){
        String b = number+"";
        int t = 0;
        switch(b){
            case "A":
                t=10;
                break;
            case "B":
                t=11;
                break;
            case "C":
                t=12;
                break;
            case "D":
                t=13;
                break;
            case "E":
                t=14;
                break;
            case "F":
                t=15;
                break;
            default:
                t=0;
        }
        return t;
    }
}
