package com.study.exer1;

public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cy = new Cylinder();

        cy.setRadius(2.1);
        cy.setLength(3.4);
        double volume = cy.findVolume();
        System.out.println("圆柱的体积为：" + volume);

        // 没有重写findArea()时
//        double area = cy.findArea();
//        System.out.println("圆的面积为："  + area);

        // 重写findArea()后
        double area = cy.findArea();
        System.out.println("圆柱的表面积为："  + area);
    }
}
