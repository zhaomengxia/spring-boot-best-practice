package cn.javastack.springboot.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * 微信公众号：Java技术栈
 */
@SpringBootApplication
public class Application {

    @Autowired
    private InfoConfig infoConfig;
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return (args ->{
            System.out.println(infoConfig.getAddress1()+"   "+infoConfig.getCompany()+"  "+infoConfig.getDegree()+"  ");
        } );
    }

}
