package cn.javastack.test.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.ant.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ZUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String name;

    private String password;

    private String mobile;

    private String email;

    private LocalDate birthday;

    private String education;

    private Integer gender;

    private String profession;

    private String photo;

    private String college;

    private String urgentPerson;

    private String urgentContact;

    private Boolean isDeleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String position;

    private Integer divisionId;

    private Integer organizationId;


}
