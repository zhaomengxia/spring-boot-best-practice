package cn.javastack.springboot.random;

import cn.javastack.springboot.random.config.DBConfig;
import cn.javastack.springboot.random.config.RandomConfig;
import cn.javastack.springboot.random.config.TestConfig;
import cn.javastack.springboot.random.config.TestEnvironmentConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * 微信公众号：Java技术栈
 */
@SpringBootApplication
@EnableConfigurationProperties
public class Application {

    @Autowired
    private RandomConfig randomConfig;

    @Autowired
    private TestConfig testConfig;

    @Autowired
    private DBConfig dbConfig;

    @Autowired
    private TestEnvironmentConfig t;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return (args) -> {
            System.out.println(randomConfig+"llllllllllllllllllllllllllllllllllllllllll");
            System.out.println(testConfig.getAddress()+".....   ..... ");
            System.out.println(dbConfig.getPassword()+"  "+dbConfig.getUsername());

            System.out.println(t.getProperty());
        };
    }


}
