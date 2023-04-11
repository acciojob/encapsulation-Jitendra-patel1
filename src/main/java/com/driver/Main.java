package com.driver;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {


        RWOnly obj = new RWOnly();
        // obj.name="Jitendra";
        // 'name' has private access in 'com.driver.RWOnly'
        obj.setName("Jitendra");
        String ans=obj.getName();
        System.out.println(ans);

    }
}