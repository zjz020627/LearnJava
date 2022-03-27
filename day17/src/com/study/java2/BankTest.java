package com.study.java2;

/**
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 *
 *
 * @author RenAshbell
 * @create 2022-03-27-20:02
 */
public class BankTest {
    public static void main(String[] args) {
        BK bk = new BK();
        new Thread(bk).start();
    }
}


class Bank{
    private Bank(){}

    private static Bank instance = null;

    public static Bank getInstance(){
        // 方式一：效率低下
//        synchronized (Bank.class) {
//            if (instance == null){
//                instance = new Bank();
//            }
//            return instance;
//        }

        // 方式二：效率更高
        if (instance == null){
            synchronized (Bank.class) {
                if (instance == null){
                    instance = new Bank();
                }
            }
        }
        return instance;
    }

}

class BK implements Runnable{
    @Override
    public void run() {
        Bank.getInstance();
    }
}