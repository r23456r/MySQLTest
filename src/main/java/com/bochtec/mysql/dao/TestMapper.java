package com.bochtec.mysql.dao;

import com.bochtec.mysql.domain.TestDomain;
import com.bochtec.mysql.domain.TestDomainExample;
import java.util.List;

import org.apache.ibatis.annotations.Lang;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.scripting.LanguageDriver;
import org.springframework.stereotype.Component;

@Component
public interface TestMapper {
    long countByExample(TestDomainExample example);

    int deleteByExample(TestDomainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestDomain record);

    int insertSelective(TestDomain record);

    List<TestDomain> selectByExample(TestDomainExample example);

    TestDomain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestDomain record, @Param("example") TestDomainExample example);

    int updateByExample(@Param("record") TestDomain record, @Param("example") TestDomainExample example);

    int updateByPrimaryKeySelective(TestDomain record);

    int updateByPrimaryKey(TestDomain record);

    Long count();
}