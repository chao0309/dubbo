package com.agree.dubbo.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestDate {
    public static void main(String[] args) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2010,4-1,1);

        System.out.println(sf.format(calendar.getWeeksInWeekYear()));
    }
    public static  String weekMontoSun(int year,int month,int weekOfMonth,int dayOfWeek){
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, 1); // x年 y月 1号
        int i_week_day = c.get(Calendar.DAY_OF_WEEK); //如果i_week_day =1 的话 实际上是周日
        int weekDay = 0;
        if(i_week_day == 1){ //dayOfWeek+1 就是星期几（星期日 为 1）
            weekDay = (weekOfMonth-1)*7 + dayOfWeek+1;
        }else{
            weekDay = 7-i_week_day+1 + (weekOfMonth-1)*7 + dayOfWeek +1;
        }
        c.set(Calendar.DATE, weekDay); //在当月1号的基础上加上相应的天数
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        return sf.format(c.getTime());
    }
}
