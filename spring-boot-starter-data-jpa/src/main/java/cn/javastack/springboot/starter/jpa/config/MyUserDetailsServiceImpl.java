package cn.javastack.springboot.starter.jpa.config;

import cn.javastack.springboot.starter.jpa.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;



/**
 * @Author: Zhao MengXia
 * @Date: 2019/3/6 15:53
 */
@Component
public class MyUserDetailsServiceImpl implements UserDetailsService {
    private Logger logger=LoggerFactory.getLogger(getClass());

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        logger.info("用户的用户名：{}",s);
        User user=new User(s,"123456");
        return user;
    }
}
