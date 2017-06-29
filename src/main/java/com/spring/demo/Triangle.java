package com.spring.demo;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*@Component*/
public class Triangle implements Shape {

    private int height;
    private int altitude;

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int b) {
        System.out.println("setting altitude");
        this.altitude = b;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int a) {
        System.out.println("setting Height");
        this.height = a;
    }



    Triangle() {

    }

    public void drawShape() {
        System.out.println("Drawing triangle");
    }

    @Override
    public String toString() {
        System.out.print(super.toString());
        return "Height =" + height + ",altitude=" + altitude;
    }

    public void init(){
        System.out.print("Inside INit method");
    }

    public void destroy(){
        System.out.print("Inside destroy method");
    }

}


