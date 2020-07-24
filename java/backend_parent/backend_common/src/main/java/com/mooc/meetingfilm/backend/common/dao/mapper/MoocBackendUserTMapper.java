package com.mooc.meetingfilm.backend.common.dao.mapper;

import com.mooc.meetingfilm.backend.common.dao.entity.MoocBackendUserT;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 * @author lyt
 * @since 2020-07-01
 */
@Mapper
public interface MoocBackendUserTMapper extends BaseMapper<MoocBackendUserT> {

    MoocBackendUserT describeUserByUserName(@Param("username") String username);

}
