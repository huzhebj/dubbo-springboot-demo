package com.huzhe;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huzhe.exception.BusinessException;
import com.huzhe.model.GetStudentsRequest;
import com.huzhe.model.GetStudentsResponse;
import com.huzhe.model.Student;
import com.huzhe.service.StudentService;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StringTest {

    /**
     * 如果需要判断某个字符串是否为空（空白字符也为空，空白符包含：空格、tab 键、换行符），使用StringUtils.isBlank方法判断
     * 使用StringUtils.isEmpty无法识别空白字符的情况
     * 使用“==”，无法识别为空字符串和空白字符的情况
     * 小结：判断字符串是否为空使用StringUtils.isBlank，不为空使用StringUtils.isNotBlank方法
     */
    @Test
    public void test1() {
        String str1 = "";
        String str2 = null;
        String str3 = " ";
        System.out.println("=====StringUtils.isBlank=====");
        System.out.println(StringUtils.isBlank(str1));
        System.out.println(StringUtils.isBlank(str2));
        System.out.println(StringUtils.isBlank(str3));
        System.out.println("=====StringUtils.isEmpty=====");
        System.out.println(StringUtils.isEmpty(str1));
        System.out.println(StringUtils.isEmpty(str2));
        System.out.println(StringUtils.isEmpty(str3));
        System.out.println("====='=='=====");
        System.out.println(str1 == null);
        System.out.println(str2 == null);
        System.out.println(str3 == null);
    }

}
