package com.bochtec.mysql.dao;

import com.bochtec.mysql.domain.KeyDomain;
import com.bochtec.mysql.domain.KeyDomainExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface KeyMapper {
    long countByExample(KeyDomainExample example);

    int deleteByExample(KeyDomainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KeyDomain record);

    int insertSelective(KeyDomain record);

    List<KeyDomain> selectByExample(KeyDomainExample example);

    KeyDomain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KeyDomain record, @Param("example") KeyDomainExample example);

    int updateByExample(@Param("record") KeyDomain record, @Param("example") KeyDomainExample example);

    int updateByPrimaryKeySelective(KeyDomain record);

    int updateByPrimaryKey(KeyDomain record);
}