package com.bochtec.mysql.dao;

import com.bochtec.mysql.domain.IndustryDomain;
import com.bochtec.mysql.domain.IndustryDomainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface IndustryMapper {
    long countByExample(IndustryDomainExample example);

    int deleteByExample(IndustryDomainExample example);

    int deleteByPrimaryKey(Integer industryId);

    int insert(IndustryDomain record);

    int insertSelective(IndustryDomain record);

    List<IndustryDomain> selectByExample(IndustryDomainExample example);

    IndustryDomain selectByPrimaryKey(Integer industryId);

    int updateByExampleSelective(@Param("record") IndustryDomain record, @Param("example") IndustryDomainExample example);

    int updateByExample(@Param("record") IndustryDomain record, @Param("example") IndustryDomainExample example);

    int updateByPrimaryKeySelective(IndustryDomain record);

    int updateByPrimaryKey(IndustryDomain record);
}