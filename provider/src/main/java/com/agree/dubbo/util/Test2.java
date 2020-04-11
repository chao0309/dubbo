package com.agree.dubbo.util;

public class Test2 {
    public static void main(String[] args) {
        double[][] arr = new double[1][3];
        arr[0][0] = 1.000000;
        arr[0][1] = 2.000000;
        arr[0][2] = 3.000000;
        Double time = new Double(0.000000);
        for(int i = 0;i < 1;i++){
//            String str = sc.nextLine();
//            String[] array = str.split(" ");
            for(int j = 0 ; j <3;j++){
//                Double num =  Double.parseDouble(arr[i][j]);
                time += arr[i][j];
            }
        }
        System.out.println(time);
    }
}
