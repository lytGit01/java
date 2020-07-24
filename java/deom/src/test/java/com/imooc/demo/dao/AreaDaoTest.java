package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;
    @Test
    void queryArea() {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2, areaList.size());
    }

    @Test
    @Ignore
    void queryById() {
    }

    @Test
    @Ignore
    void insertArea() {
    }

    @Test
    @Ignore
    void updateArea() {
    }

    @Test
    @Ignore
    void deleteArea() {
    }
}