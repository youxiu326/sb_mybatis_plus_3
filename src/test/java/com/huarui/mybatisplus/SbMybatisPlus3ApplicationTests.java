package com.huarui.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huarui.mybatisplus.entity.TblUser;
import com.huarui.mybatisplus.service.ITblUserService;
import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SbMybatisPlus3ApplicationTests {


    @Autowired
    private ITblUserService userService;

    @Test
    public void testInsert() {

        TblUser user = new TblUser();
        user.setAge(10);
        user.setEmail("youxiu326@163.com");
        user.setName("测试mybatis plus 3");
        userService.save(user);

    }

    /**
     * 条件构造器 and
     */
    @Test
    public void testQueryWrapper1(){

        QueryWrapper<TblUser> qw = new QueryWrapper();
        qw.lambda().eq(TblUser::getName,"小日2");
        qw.lambda().eq(TblUser::getEmail,"aaaaaa@.qq.com");
        List<TblUser> list = userService.list(qw);
        System.out.println(list);
    }

    /**
     * 条件构造器 or
     */
    @Test
    public void testQueryWrapper2(){

        QueryWrapper<TblUser> qw = new QueryWrapper();
        qw.lambda().eq(TblUser::getName,"小日2");
        qw.lambda().or().eq(TblUser::getEmail,"youxiu326@163.com");
        List<TblUser> list = userService.list(qw);
        System.out.println(list);
    }

    /**
     * <p>
     *     UPDATE tbl_user SET name=? WHERE (name = ?)
     *
     * </p>
     */
    @Test
    public void testUpdateWrapper1(){

        UpdateWrapper<TblUser> qw = new UpdateWrapper();
        qw.lambda().eq(TblUser::getName,"小日2");

        TblUser user = new TblUser();
        user.setName("UpdateWrapper");

        userService.update(user,qw);
        System.out.println(user);

    }

    /**
     * 分页查询
     * <p>
     * ==>    SELECT id,name,email,age,deleteFlag FROM tbl_user LIMIT ?,?
     *
     * ==>    Parameters: 0(Long), 2(Long)
     * </p>
     */
    @Test
    public void testPage(){

        QueryWrapper<TblUser> qw = new QueryWrapper();

        Long pageNum = 0L;
        Long pageSize = 2L;

        Page<TblUser> page = userService.page(new Page<>(pageNum, pageSize), qw);
        System.out.println(page);

    }

}
