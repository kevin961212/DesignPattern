package com.kevin.结构型模式.适配器模式.adapter;

/**
 * @author kevin
 * @version 1.0
 * @description     客户端类
 * 相当于例子中的笔记本，只有USB接口
 * @createDate 2019/2/25
 */
public class Test {

    public void test1(Target t){
        t.handleReq();
    }

    public static void main(String[] args) {
        Test test = new Test();
        Adaptee a = new Adaptee();

        // 类适配器
        Target t = new Adapter();
        test.test1(t);

        // 对象适配器
        Target t1 = new Adapter2(a);
        test.test1(t1);

    }
}
