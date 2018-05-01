package com.sn.io.file;

import java.io.File;

/*
相对路径与绝对路径构造file对象
 */
public class Demo2 {
    public static void main(String[] args) {
        String parentPath="D:/1";
        String name="1.png";
        //相对路径
        File src=new File(parentPath,name);

        src=new File(new File(parentPath),name);

        System.out.println(src.getName());
        System.out.println(src.getPath());

        //绝对路径
        src=new File("D:/1/1.png");
        System.out.println(src.getName());
        System.out.println(src.getPath());

        //如果没有盘幅
        src=new File("text.txt");
        src=new File(".");//.表示当前路径
        System.out.println(src.getName());
        System.out.println(src.getPath());
        System.out.println(src.getAbsolutePath());//以工作空间来构建

    }
}
