package com.huarui.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author youxiu326
 * @since 2020-08-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TblUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String email;

    private Integer age;

    @TableField("deleteFlag")
    private Integer deleteFlag;


}
