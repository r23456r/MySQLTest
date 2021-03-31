package com.bochtec.mysql.dao;

import com.bochtec.mysql.domain.Base64Domain;
import com.bochtec.mysql.domain.Base64DomainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface Base64Mapper {
    long countByExample(Base64DomainExample example);

    int deleteByExample(Base64DomainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Base64Domain record);

    int insertSelective(Base64Domain record);

    List<Base64Domain> selectByExample(Base64DomainExample example);

    Base64Domain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Base64Domain record, @Param("example") Base64DomainExample example);

    int updateByExample(@Param("record") Base64Domain record, @Param("example") Base64DomainExample example);

    int updateByPrimaryKeySelective(Base64Domain record);

    int updateByPrimaryKey(Base64Domain record);
}