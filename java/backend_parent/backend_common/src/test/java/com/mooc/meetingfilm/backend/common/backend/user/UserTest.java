package com.mooc.meetingfilm.backend.common.backend.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mooc.meetingfilm.backend.common.BackendCommonApplicationTests;
import com.mooc.meetingfilm.backend.common.dao.entity.MoocBackendUserT;
import com.mooc.meetingfilm.backend.common.dao.mapper.MoocBackendUserTMapper;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class UserTest extends BackendCommonApplicationTests {

    @Resource
    private MoocBackendUserTMapper backendUser;

    @Test
    public void add () {
        for (int i = 1; i < 6; i++) {
            MoocBackendUserT user = new MoocBackendUserT();
            user.setUserName("admin" + i);
            user.setUserPwd("admin" + 1);
            user.setUserPhone("13100000000" + i);
            backendUser.insert(user);
        }
    }

    @Test
    public void del () {
        backendUser.deleteById(8);
    }

    @Test
    public void update () {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("user_name", "admin4");
        MoocBackendUserT user = new MoocBackendUserT();
        user.setUserName("lyt");
        user.setUserPwd("1122");
        user.setUserPhone("17600234768");
        backendUser.update(user, wrapper);
    }

    @Test
    public void select () {
//        MoocBackendUserT row = backendUser.selectById(7);
//        System.out.println(row);
        // ²éÑ¯ÁÐ±í

        QueryWrapper wrapper = new QueryWrapper();
        wrapper.like("user_name", "admin");
        List<MoocBackendUserT> list = backendUser.selectList(wrapper);
        list.stream().forEach(
                System.out::println
        );

    }

    @Test
    public void selectByPage () {
        Page<MoocBackendUserT> page = new Page<>(1, 3);
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.like("user_name", "admin");

        IPage<MoocBackendUserT> iPage = backendUser.selectPage(page, wrapper);
        iPage.getRecords().forEach(
                System.out::println
        );
    }

    @Test
    public void desribeUser () {
        MoocBackendUserT user = backendUser.describeUserByUserName("admin1");
        System.out.println(user);
    }
}
