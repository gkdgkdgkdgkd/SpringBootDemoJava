package com.example.demo.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author author
 * @since 2022-06-01
 */
@Getter
@Setter
@Builder
public class User {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    private String name;

    private Integer age;

}
