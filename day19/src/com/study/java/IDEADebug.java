package com.study.java;

import org.junit.Test;

/**
 * @author RenAshbell
 * @create 2022-03-29 12:00
 */
public class IDEADebug {
    @Test
    public void testStringBuffer(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());// 4

        System.out.println(sb);// "null"

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);// 报错
    }
}
