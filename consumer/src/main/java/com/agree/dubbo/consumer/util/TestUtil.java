package com.agree.dubbo.consumer.util;


import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.spring.ServiceBean;

import java.util.Scanner;

public class TestUtil {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        Scanner s2 = new Scanner(System.in);
//        String str2 = s2.nextLine();
//        char c = str2.charAt(0);
        String a = "AbsfRJX67ss";
        System.out.println(a.toLowerCase());
    }
    private static int getLen(String str,char ch){
        int le = 0;
        int lll = str.length();
        for(int i = 0;i < lll;i++){
            if(ch == str.charAt(i)){
                le ++;
            }
        }
        return le;
    }
}
