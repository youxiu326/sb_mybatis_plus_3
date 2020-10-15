package com.huarui.mybatisplus.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
 * @since 2020-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TblUser extends Model<TblUser> {

    private static final long serialVersionUID = 1L;

    private String name;

    private String email;

    private Integer age;

    @TableField("deleteFlag")
    private Integer deleteFlag;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
