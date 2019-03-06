package cn.javastack.springboot.starter.jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author  hahaha 
 * @since 2019-02-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(value="ZRoles对象", description="")
public class ZRoles implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String roleName;

    private String description;

    private Boolean deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer parentId;

    private Integer roleType;

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    private List<ZResources> resources;

}
