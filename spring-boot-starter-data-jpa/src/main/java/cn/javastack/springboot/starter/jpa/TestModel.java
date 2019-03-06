package cn.javastack.springboot.starter.jpa;

import cn.javastack.springboot.starter.jpa.common.BaseModel;
import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author: Zhao MengXia
 * @Date: 2019/3/6 9:54
 */
@Entity
@Table(name="test")
@Data
public class TestModel extends BaseModel {

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;

}
