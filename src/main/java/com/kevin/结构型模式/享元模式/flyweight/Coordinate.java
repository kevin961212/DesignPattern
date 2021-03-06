package com.kevin.结构型模式.享元模式.flyweight;

/**
 * @author kevin
 * @version 1.0
 * @description     UnSharedConcreteFlyWeight非共享享元类，外部状态，不能被共享的子类
 * @createDate 2019/3/2
 */
public class Coordinate {

    private int x,y;

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
