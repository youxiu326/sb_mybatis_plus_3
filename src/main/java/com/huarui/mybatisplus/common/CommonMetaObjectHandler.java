package com.huarui.mybatisplus.common;

import java.time.LocalDateTime;
import java.util.Date;
import org.apache.ibatis.reflection.MetaObject;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;

/**
 * @Auther: lihui
 * @Date: 2020-10-15 20:46
 * @Description:
 */
public class CommonMetaObjectHandler implements MetaObjectHandler {

    public void insertFill(MetaObject metaObject) {
        Boolean createTimeHas = metaObject.hasGetter("createTime");
        Boolean updateTimeHas = metaObject.hasGetter("updateTime");
        Boolean modifyTimeHas = metaObject.hasGetter("modifyTime");
        if (createTimeHas) {
            if (metaObject.getGetterType("createTime").isInstance(new Date())) {
                this.strictInsertFill(metaObject, "createTime", Date.class, new Date());
            } else if (metaObject.getGetterType("createTime").isInstance(LocalDateTime.now())) {
                this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now());
            }
        }

        if (updateTimeHas) {
            if (metaObject.getGetterType("updateTime").isInstance(new Date())) {
                this.strictInsertFill(metaObject, "updateTime", Date.class, new Date());
            } else if (metaObject.getGetterType("updateTime").isInstance(LocalDateTime.now())) {
                this.strictInsertFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
            }
        }

        if (modifyTimeHas) {
            if (metaObject.getGetterType("modifyTime").isInstance(new Date())) {
                this.strictInsertFill(metaObject, "modifyTime", Date.class, new Date());
            } else if (metaObject.getGetterType("modifyTime").isInstance(LocalDateTime.now())) {
                this.strictInsertFill(metaObject, "modifyTime", LocalDateTime.class, LocalDateTime.now());
            }
        }

    }

    public void updateFill(MetaObject metaObject) {
        Boolean updateTimeHas = metaObject.hasGetter("updateTime");
        Boolean modifyTimeHas = metaObject.hasGetter("modifyTime");
        if (updateTimeHas) {
            if (metaObject.getGetterType("updateTime").isInstance(new Date())) {
                this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date());
            } else if (metaObject.getGetterType("updateTime").isInstance(LocalDateTime.now())) {
                this.strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
            }
        }

        if (modifyTimeHas) {
            if (metaObject.getGetterType("modifyTime").isInstance(new Date())) {
                this.strictUpdateFill(metaObject, "modifyTime", Date.class, new Date());
            } else if (metaObject.getGetterType("modifyTime").isInstance(LocalDateTime.now())) {
                this.strictUpdateFill(metaObject, "modifyTime", LocalDateTime.class, LocalDateTime.now());
            }
        }

    }

}