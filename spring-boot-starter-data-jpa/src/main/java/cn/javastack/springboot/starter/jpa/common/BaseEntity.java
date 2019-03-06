package cn.javastack.springboot.starter.jpa.common;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @Author: Zhao MengXia
 * @Date: 2019/3/6 9:56
 */
@MappedSuperclass
@Data
public class BaseEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
}
