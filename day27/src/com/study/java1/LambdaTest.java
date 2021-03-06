package com.study.java1;

import org.junit.Test;

import java.util.Comparator;

/**
 * Lambda表达式的使用举例
 *
 * @author RenAshbell
 * @create 2022-04-15-9:05
 */
public class LambdaTest {

    @Test
    public void test1(){

        Runnable r1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };

        r1.run();

        Runnable r2 = () -> System.out.println("我爱北京故宫");

        r2.run();

    }

    @Test
    public void test2(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        int cp1 = com1.compare(12, 21);
        System.out.println(cp1);

        System.out.println("********************");

        // Lambda表达式的写法
        Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1,o2);

        int cp2 = com2.compare(12, 21);
        System.out.println(cp2);

        System.out.println("********************");

        // 方法引用
        Comparator<Integer> com3 = Integer :: compare;

        int cp3 = com3.compare(12, 21);
        System.out.println(cp3);


    }
}
