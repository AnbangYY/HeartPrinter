package com.company;

public class Main {

    public static char alphabet = 'Y';

    static char change(){
        if(alphabet == 'Z'){
            alphabet = 'Y';
            return alphabet;
        }
        if(alphabet == 'Y'){
            alphabet = 'Z';
            return alphabet;
        }
        return '1';
    }

    public static void main(String[] args) {
        //上中下
        for (int i = 0, k = 0; i < 14; i++) {// 打印行
            // 上部分 上分为 四个部分
            if (i < 3) {
                for (int j = 0; j < 5 - 2 * i; j++) {// 1、空心
                    System.out.print(" ");
                }
                if (i == 2) {// 2、*
                    for (int j = 0; j < 6 + 4 * i - 1; j++) {
                        System.out.print(change());
                    }
                    for (int j = 0; j < 7 - 4 * i + 2; j++) {// 3、空心
                        System.out.print(" ");
                    }
                    for (int j = 0; j < 6 + 4 * i - 1; j++) {// 4、*
                        System.out.print(change());
                    }
                } else {
                    for (int j = 0; j < 6 + 4 * i; j++) {// 2、*
                        System.out.print(change());
                    }
                    for (int j = 0; j < 7 - 4 * i; j++) {// 3、空心
                        System.out.print(" ");
                    }
                    for (int j = 0; j < 6 + 4 * i; j++) {// 4、*
                        System.out.print(change());
                    }
                }
            } else if (i < 6) {// 中间
                for (int j = 0; j < 29; j++) {
                    System.out.print(change());
                }
            } else {// 下部分 6
                if (i == 13) {
                    for (int j = 0; j < 2 * (i - 6); j++) {// 打印空格
                        System.out.print(" ");
                    }
                    System.out.print(change());
                } else {
                    for (int j = 0; j < 2 * (i - 6) + 1; j++) {// 打印空格
                        System.out.print(" ");
                    }
                    for (int j = 1; j < 28 - 4 * k; j++) {
                        System.out.print(change());
                    }
                    k++;
                }
            }
            System.out.println();// 换行
        }

    }
}
