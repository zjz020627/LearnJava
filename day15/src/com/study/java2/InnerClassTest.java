package com.study.java2;

/**
 * 1.java中允许一个类A声明在另一个类B中，则类A就是内部类，类B称为外部类
 *
 * 2.内部类的分类：成员内部类(静态、非静态) vs 局部内部类(方法内、代码块内、构造器内)
 *
 * 3.成员内部类
 *      一方面：作为外部类的成员：
 *          > 调用外部类的结构
 *          > 可以被static修饰
 *          > 可以被4种不同的权限修饰符修饰
 *
 *      另一方面：作为一个类；
 *          > 类内可以定义属性、方法、构造器
 *          > 可以被final修饰，表示此类不能被继承。言外之意，不使用final，就可以被继承
 *          > 可以被abstract修饰
 *
 * 4.关注一下问题
 *  4.1 如何实例化成员内部类的对象
 *  4.2 如何在成员内部类中区分调用外部类的结构
 *  4.3 开发中局部内部类的使用
 */

public class InnerClassTest {
    public static void main(String[] args) {

        // 创建Bird实例(静态的成员内部类)
        Person.Bird bird = new Person.Bird();
        bird.sing();

        // 创建Dog实例(非静态的成员内部类)
        Person p = new Person();
        Person.Dog dog = p.new Dog();
        dog.show();
        dog.display("小王");
    }
}

class Person{

    String name = "人";
    int age;

    public void eat(){
        System.out.println("人吃饭");
    }

    // 静态成员内部类
    static class Bird{
        String name;

        public Bird(){

        }

        public void sing(){
            System.out.println("一只鸟");
//            eat();
        }
    }

    // 非静态成员内部类
    class Dog{
        String name = "旺财";

        public Dog(){

        }

        public void show(){
            Person.this.eat();
        }

        public void display(String name){
            System.out.println(name);// 方法的形参
            System.out.println(this.name);// 内部类的属性
            System.out.println(Person.this.name); // 外部类的属性
        }
    }

    public void method(){
        // 局部内部类
        class AA{

        }
    }

    {
        // 局部内部类
        class BB{

        }
    }

    public Person(){
        // 局部内部类
        class CC{

        }
    }
}
