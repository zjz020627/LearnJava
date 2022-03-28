package com.study.java;

public class TemplateTest {
    public static void main(String[] args) {

        Template t = new SubTemplate();

        t.spendTime();

    }
}

abstract class Template{
    // 计算某段代码执行需要花费的时间
    public void spendTime(){
        long start = System.currentTimeMillis();

        code();

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));
    }

    public abstract void code();
}

class SubTemplate extends Template{
    @Override
    public void code() {
        for (int i = 0;i <= 1000;i++){
            boolean isFlag = true;
            for (int j = 2;j <= Math.sqrt(i);j++){
                if (i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag){
                System.out.println(i);
            }
        }
    }
}