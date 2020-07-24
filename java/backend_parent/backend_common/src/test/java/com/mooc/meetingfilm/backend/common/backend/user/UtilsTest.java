package com.mooc.meetingfilm.backend.common.backend.user;

import com.mooc.meetingfilm.utils.common.vo.BaseResponseVo;
import org.junit.Test;

public class UtilsTest {
    @Test
    public void test () {
        BaseResponseVo responseVo = new BaseResponseVo();
        System.out.println(responseVo.run("helloWord"));
    }
}
