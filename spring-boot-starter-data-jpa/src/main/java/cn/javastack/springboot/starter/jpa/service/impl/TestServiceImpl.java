package cn.javastack.springboot.starter.jpa.service.impl;

import cn.javastack.springboot.starter.jpa.TestModel;
import cn.javastack.springboot.starter.jpa.dao.TestRepository;
import cn.javastack.springboot.starter.jpa.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Zhao MengXia
 * @Date: 2019/3/6 11:44
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestRepository testRepository;
    @Override
    public List<TestModel> findAll() {
        return testRepository.findAllByDeletedIsFalse();
    }

    @Override
    public boolean save(TestModel testModel) {
        testRepository.save(testModel);
        return  true;
    }
}
