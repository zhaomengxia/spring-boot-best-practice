package cn.javastack.springboot.random.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Zhao MengXia
 * @Date: 2019/3/5 15:29
 * Spring Boot读取配置的集中方式
 * @Value注解读取方式
 */
@Component
@Data
public class TestConfig {
    @Value("${server.address}")
    private String address;
}
