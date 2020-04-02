package com.didispace.chapter21;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Brown 这里使用@Data注解可以实现在编译器自动添加set和get函数的效果。该注解是lombok提供的 <dependency> <groupId>org.projectlombok</groupId>
 *         <artifactId>lombok</artifactId> </dependency>
 */
@Data
@ApiModel(description = "用户实体")
public class User {
    @ApiModelProperty("用户编号")
    private Long id;
    @ApiModelProperty("用户名称")
    private String name;
    @ApiModelProperty("用户年龄")
    private Integer age;

}