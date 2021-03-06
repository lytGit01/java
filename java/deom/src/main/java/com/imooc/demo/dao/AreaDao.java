package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;

import java.util.List;

public interface AreaDao {
    /*
    * 列出区域列表
    *
    * @return areaList
    * */
    List<Area> queryArea();

    /*
    * 根据id列出具体区域
    *
    * @return area
    * */
    Area queryById(int areaId);

    /*
    * 插入区域信息
    *
    * @param area
    * @return
    * */
    int insertArea(Area area);

    /*
     * 更新区域信息
     *
     * @param area
     * @return
     * */
    int updateArea(Area area);

    /*
    * 删除区域ID
    *
    * @return
    * */
    int deleteArea(int areaId);
}
