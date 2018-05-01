package com.sn.io.file;

import java.io.File;

/*
1.路径分隔符
2.文件分隔符 \(window) /(linux
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(File.pathSeparator);
        System.out.println(File.separator);
        //路径表示形式
        String path="D:\\1\\1.png";
        //适合动态
        path="E:"+File.separator+"1"+File.separator+"1.png";
        //推荐的方式
        path="D:/1/1.jpg";
    }
}
