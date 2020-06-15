package com.huzhe.taskschedule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TimerTest {
    /**
     * 这是java自带的java.util.Timer类，这个类允许你调度一个java.util.TimerTask任务。
     * 使用这种方式可以让你的程序按照某一个频度执行，但不能在指定时间运行。一般用的较少。
     */
    @Test
    public void test() {
        //详见  ScheduleUtils.timerTest
    }

}
