package com.bochtec.mysql.dao;

import com.bochtec.mysql.domain.IndustryInfoDomain;
import com.bochtec.mysql.domain.IndustryInfoDomainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface IndustryInfoMapper {
    long countByExample(IndustryInfoDomainExample example);

    int deleteByExample(IndustryInfoDomainExample example);

    int deleteByPrimaryKey(Integer industryId);

    int insert(IndustryInfoDomain record);

    int insertSelective(IndustryInfoDomain record);

    List<IndustryInfoDomain> selectByExample(IndustryInfoDomainExample example);

    IndustryInfoDomain selectByPrimaryKey(Integer industryId);

    int updateByExampleSelective(@Param("record") IndustryInfoDomain record, @Param("example") IndustryInfoDomainExample example);

    int updateByExample(@Param("record") IndustryInfoDomain record, @Param("example") IndustryInfoDomainExample example);

    int updateByPrimaryKeySelective(IndustryInfoDomain record);

    int updateByPrimaryKey(IndustryInfoDomain record);
}