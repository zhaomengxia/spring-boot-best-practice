package cn.javastack.springboot.random.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: Zhao MengXia
 * @Date: 2019/3/5 15:38
 * Spring Boot读取配置的集中方式
 * @PropertySource+@Value注解读取方式
 */
@Component
@PropertySource(value = {"db-config.properties"})
@Data
public class DBConfig {
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;
}
