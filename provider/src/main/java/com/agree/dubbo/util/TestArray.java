package com.agree.dubbo.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int n = 2;
        List<List<String>> arraylist = new ArrayList<>();
//        while (sc.hasNextLine()){
//            String str = sc.nextLine();
//            String[] arr = str.split(",");
//            List<String> list = Arrays.asList(arr);
//            arratlist.add(list);
//        }
        for (int i = 0; i<4;i++){
            List<String> l = new ArrayList<>();
            String[] str = new String[]{"1","2","3"};
            l = Arrays.asList(str);
            arraylist.add(l);
        }
        ArrayList<String> a = new ArrayList<>();
//        for (int j =0;j< arraylist.size();j++){
////            if(arraylist.get(j).size()>3){
////                a.addAll(arraylist.get(0));
////            }
////        }
        int num = 0;
        for (List l : arraylist ){
            if(l.size() >num){
                num = l.size();
            }
        }
        int len = num%n == 0 ? num/n : num/n + 1;
        for (int j = 0 ; j<len ;j++){
            for (int m = 0;m< n;m++){
//                List arr = arraylist.get
            }
        }
//        3
//        2,5,6,7,9,5,7
//        1,7,4,3,4

//        2,5,6,1,7,4,7,9,5,3,4,7

//        1 3
//        3.000000
//        2.000000
//        1.000000
//
//        6.000000
    }

}
