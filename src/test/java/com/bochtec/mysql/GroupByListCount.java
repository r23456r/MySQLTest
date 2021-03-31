package com.bochtec.mysql;

import com.bochtec.mysql.util.ArraysUtils;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: zhangyuhang
 * @modified By：
 * @date ：Created in 2020/12/24 9:40
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class GroupByListCount {

    @Test
    public final void givenList_whenParitioningIntoNSublistsUsingGroupingBy_thenCorrect() {
        List<String> intList = Lists.newArrayList("1", "2", "3", "4", "5", "6", "7", "8");
        List<List<String>> lists = ArraysUtils.averageAssign(intList, 7);
        lists.forEach(list -> System.out.println(Arrays.toString(list.toArray())));
    }
}
