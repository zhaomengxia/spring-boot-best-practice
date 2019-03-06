package cn.javastack.springboot.starter.jpa.common;

import lombok.Data;


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @Author: Zhao MengXia
 * @Date: 2019/3/6 10:00
 */
@MappedSuperclass
@Data
public class BaseModel extends BaseEntity{
    @Column(name = "is_deleted",nullable = false,columnDefinition = "bit(1) default 0")
    private Boolean deleted=false;

    @Column(insertable = false)
    private Date updateTime=new Date();

    @Column(nullable = false,updatable = false,columnDefinition = "dateTime default CURRENT_TIMESTAMP")
    private Date createTime=new Date();

}
