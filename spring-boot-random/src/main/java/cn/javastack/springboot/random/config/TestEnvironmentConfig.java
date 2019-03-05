package cn.javastack.springboot.random.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @Author: Zhao MengXia
 * @Date: 2019/3/5 15:52
 * Environment 读取方式
 */
@Configuration
@PropertySource("db-config.properties")
public class TestEnvironmentConfig {
    @Autowired
    Environment environment;
    public String getProperty(){
        System.out.println(environment.getProperty("db.username"));
        System.out.println(environment.getProperty("db.password"));
        return "";
    }
}
