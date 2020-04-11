package com.agree.dubbo.consumer.util;

import java.util.ArrayList;
import java.util.List;

public class TestTranslate {

    public static void main(String[] args) {
        String str = "108 1 2 3 4 5 6 A C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D C D";
//        List<String> list = new ArrayList<>();
        String[] arr = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i< arr.length-1;i++){
//            list.add(arr[i+1]);
            sb.append(get(arr[i+1]));
            sb.append(" ");
        }
        String print = sb.toString().trim();
        int len = print.split(" ").length + 1 ;
        System.out.println(len + " " + print);
    }
    private static String get(String num){
        String new_num = num.toUpperCase();
        if("A".equals(new_num)){
            return "12 34";
        }else if("B".equals(new_num)){
            return "AB CD";
        }else {
            return new_num;
        }
    }
}
