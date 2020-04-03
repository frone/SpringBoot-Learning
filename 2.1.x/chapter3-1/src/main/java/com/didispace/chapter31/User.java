package com.didispace.chapter31;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Brown
 * User实体对应 USER表（大写）
 */
@Data
@NoArgsConstructor
public class User {

    private String name;
    private Integer age;
    private Boolean deleted;
}