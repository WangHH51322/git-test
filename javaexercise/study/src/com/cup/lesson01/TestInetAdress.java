package com.cup.lesson01;

import java.net.InetAddress;
import java.net.UnknownHostException;

//测试IP
public class TestInetAdress {
    public static void main(String[] args) {
        try {
            //查询本机地址
            InetAddress inetAddress1 = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress1);
            InetAddress inetAddress11 = InetAddress.getByName("localhost");
            System.out.println(inetAddress11);
            InetAddress inetAddress12 = InetAddress.getLocalHost();
            System.out.println(inetAddress12);

            //查询网站ip地址
            InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress2);

            //常用方法
            //System.out.println(inetAddress2.getAddress());
            System.out.println(inetAddress2.getCanonicalHostName());//规范的名字
            System.out.println(inetAddress2.getHostAddress());//ip
            System.out.println(inetAddress2.getHostName());//域名，或者自己电脑的名字

        }catch(UnknownHostException e){
            e.printStackTrace();
        }

    }

}
