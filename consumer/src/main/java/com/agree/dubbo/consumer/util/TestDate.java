package com.agree.dubbo.consumer.util;

import sun.util.resources.CalendarData;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestDate {

    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
        String date = "2018 02 3 1";
        getDate(date);
    }

    private static  void getDate(String date){
        String[] dateArray = date.split(" ");
        String year = dateArray[0];
        String month = dateArray[1];
        String week = dateArray[2];
        String weekday = dateArray[3];



    }
    private static boolean RunYear(String str){
        int year = Integer.parseInt(str);
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        }else{
            return false;
        }
    }
   
}
