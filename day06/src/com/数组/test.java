package com.数组;

public class test {
    public static void main(String[] args) {
        int[][] arr1 = new int[4][];
        arr1[1] = new int[]{1, 2, 3};
        System.out.println(arr1[1][2]);

        // 覆盖arr[1]
        arr1[1] = new int[4];
        arr1[1][3] = 5;
        System.out.println(arr1[1][3]);
        arr1[2] = new int[4];
        arr1[2][1] = 30;
        System.out.println(arr1[2][1]);
    }
}