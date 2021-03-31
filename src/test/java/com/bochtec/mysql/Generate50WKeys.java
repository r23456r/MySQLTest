package com.bochtec.mysql;

import com.bochtec.mysql.dao.IndustryMapper;
import com.bochtec.mysql.dao.KeyMapper;
import com.bochtec.mysql.domain.KeyDomain;
import com.bochtec.mysql.util.ArraysUtils;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author: zhangyuhang
 * @modified By：
 * @date ：Created in 2021/3/23 15:05
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Generate50WKeys {

    @Autowired
    private KeyMapper keyMapper;
    @Test
    public final void ok() {
        KeyDomain domain = keyMapper.selectByPrimaryKey(6774);
        domain.setId(null);
        for (int i = 0; i < 50500; i++) {
            domain.setKeyId("test" + (i + 1));
            keyMapper.insert(domain);
        }
    }
}
