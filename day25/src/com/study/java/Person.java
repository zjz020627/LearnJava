package com.study.java;

import java.io.Serializable;

/**
 * Person需要满足如下的要求方可序列化
 * 1.需要实现接口：Serializable
 * 2.当前类提供一个全局常量：serialVersionUID（必加！）
 * 3.除了当前Person类需要实现Serializable接口之外，还必须保证其内部所以属性
 *   也必须是可序列化的。
 *
 * 补充：ObjectOutputStream和ObjectInputStream不能序列化static和transient修饰的成员
 *
 * @author RenAshbell
 * @create 2022-04-12-11:28
 */
public class Person implements Serializable {
    public static final long serialVersionUID = 475463534532L;

    private static String name;
    private transient int age;
    private int id;
    private Account acct;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int id, Account acct) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.acct = acct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getAcct() {
        return acct;
    }

    public void setAcct(Account acct) {
        this.acct = acct;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", acct=" + acct +
                '}';
    }
}

class Account implements Serializable{
    private double balance;
    public static final long serialVersionUID = 4754635345772L;


    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
