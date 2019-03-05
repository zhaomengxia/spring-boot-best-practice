package cn.javastack.springboot.profile;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Zhao MengXia
 * @Date: 2019/3/5 14:12
 * @Value注解读取方式
 */
@Component
@Data
public class InfoConfig {
    @Value("${info.address1}")
    private String address1;
    @Value("${info.company}")
    private  String company;
    @Value("${info.degree}")
    private  String degree;

}
