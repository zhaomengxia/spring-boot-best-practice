package cn.javastack.springboot.starter.jpa.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@ApiModel(value="ZResources对象", description="")
public class ZResources implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String description;

    private String httpPath;

    private Boolean deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer parentId;

    private String node;

    private Integer layer;

    private Integer seq;

    private String url;

    private String icon;

    @JsonIgnore
    private Boolean hasPersission;
}
