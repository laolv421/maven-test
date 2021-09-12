package org.example.mavenTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        // 使用ClassLoader加载properties配置文件生成对应的输入流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("conf/log.properties"));
        // 使用properties对象加载输入流
        properties.load(bufferedReader);
        //获取key对应的value值
        System.out.println(properties.getProperty("test"));
    }

}
