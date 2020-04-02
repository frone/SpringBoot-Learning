package com.didispace.chapter22;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Brown
 */
@Data
@ApiModel(description="用户实体")
public class User {

    @ApiModelProperty(value = "用户编号",required = true,position = 0)
    private Long id;

    @ApiModelProperty(value = "用户姓名",required = true,position = 1)
    @NotNull
    @Size(min = 2,max = 5)
    private String name;

    @ApiModelProperty(value = "用户年龄",required = true,position = 2)
    @NotNull
    @Max(120)
    @Min(5)
    private Integer age;

    @Email
    @NotNull
    @ApiModelProperty(value = "用户邮箱",required = false,position = 3)
    private String email;
}