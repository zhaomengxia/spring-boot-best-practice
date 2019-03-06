package cn.javastack.springboot.starter.jpa.service;

import cn.javastack.springboot.starter.jpa.TestModel;

import java.util.List;

/**
 * @Author: Zhao MengXia
 * @Date: 2019/3/6 11:43
 */
public interface TestService {
    List<TestModel> findAll();
    boolean save(TestModel testModel);
}
