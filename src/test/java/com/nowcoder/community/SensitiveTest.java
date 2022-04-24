package com.nowcoder.community;

import com.nowcoder.community.util.SensitiveFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = NowcoderApplication.class)
public class SensitiveTest {

    @Autowired
    private SensitiveFilter sensitiveFilter ;

    @Test
    public void testSensitiveFilter(){
        String text = "吸毒嫖娼杀人赌博强奸";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }

}
