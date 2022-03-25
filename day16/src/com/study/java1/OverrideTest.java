package com.study.java1;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 */

public class OverrideTest {
    public static void main(String[] args) {
        OverrideTest test = new OverrideTest();
        test.display(new SubClass());
    }

    public void display(SuperClass s){
        try {
            s.method();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

class SuperClass{
    public void method() throws IOException{

    }
}

class SubClass extends SuperClass{
    @Override
    public void method() throws FileNotFoundException {

    }
}