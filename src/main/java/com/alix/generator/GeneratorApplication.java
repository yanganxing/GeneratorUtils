package com.alix.generator;

import com.alix.generator.config.Config;

import java.io.File;

/**
 * @author 杨安星(Alix)
 * @create 2020-05-25 12:45
 */

public class GeneratorApplication {

    public static void main(String[] args) {
        Generator g = new Generator(Config.getInstance()
                .setDriver("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://127.0.0.1:3306/info_system?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&useSSL=false&allowPublicKeyRetrieval=true&useLegacyDatetimeCode=false")
                .setUsername("root")
                .setPassword("root")
                .setPrimaryKeyType("Long")
//                .setClassPrefix("HouTu")
//                .setClearClassPrefix("HouTu")
                .setOutRootDir(System.getProperty("user.dir") + File.separator + "generator-output"));

        //删除生成器的输出目录
        g.deleteOutRootDir();

        // 打印所有表
        g.printAllTableInfo();

        // 生成单个表的Java文件
        g.generate("sys_user");
        // 生成多个表的Java文件
//        g.generate("links", "user");
        // 生成所有表的Java文件
//        g.generate();
        // 生成所有表的Java文件
//        g.generateAll();
    }
}
