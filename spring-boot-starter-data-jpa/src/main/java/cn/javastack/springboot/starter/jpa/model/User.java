package cn.javastack.springboot.starter.jpa.model;

import cn.javastack.springboot.starter.jpa.common.BaseModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * @Author: Zhao MengXia
 * @Date: 2019/3/6 15:58
 */
@Entity
@Table(name = "z_user")
public class User extends BaseModel implements UserDetails,Serializable {

    private static final long serialVersionUID = 1L;

    protected Long id;

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
    @ApiModelProperty(hidden = true)
    private List<ZRoles> roles;

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    private Boolean deleted;

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    private LocalDateTime createTime;

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    private LocalDateTime updateTime;

    private String position;

    private Integer divisionId;

    private Integer organizationId;

    @Override
    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils
                .createAuthorityList(this.roles.parallelStream().map(ZRoles::getRoleName)
                        .toArray(String[]::new));
    }


    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public String getUsername() {
        return name;
    }

    @Override
    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public boolean isEnabled() {
        return true;
    }

}
