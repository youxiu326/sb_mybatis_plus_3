package com.huarui.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
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

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    private String name;

    private String email;

    private Integer age;

    @TableField("deleteFlag")
    private Integer deleteFlag;


}
