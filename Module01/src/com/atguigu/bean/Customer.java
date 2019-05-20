package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//这是单行注释
public class Customer extends Person{

    //*******下面重写eat方法：
    public void eat(){
        System.out.println("客户吃饭");

    }    public static void main(String[] ags){
        System.out.println("module test");
        List<String> list = new ArrayList<>();
        System.out.println(Collections.addAll(list));
    }
    public static void test(){

    }

}
