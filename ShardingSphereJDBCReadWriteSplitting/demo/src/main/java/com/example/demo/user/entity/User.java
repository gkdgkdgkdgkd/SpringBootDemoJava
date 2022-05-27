package com.example.demo.user.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author author
 * @since 2022-05-26
 */
@Getter
@Setter
@Builder
public class User {

    private Long id;

    private String name;

}
