package cn.javastack.springboot.starter.jpa.dao;

import cn.javastack.springboot.starter.jpa.TestModel;
import cn.javastack.springboot.starter.jpa.common.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Zhao MengXia
 * @Date: 2019/3/6 10:39
 */
@Repository
public interface TestRepository extends BaseRepository<TestModel,Long> {

    List<TestModel> findAllByDeletedIsFalse();
}
