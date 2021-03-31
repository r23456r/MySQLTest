package com.bochtec.mysql.dao;

import com.bochtec.mysql.domain.BusinessBrifDomain;
import com.bochtec.mysql.domain.BusinessBrifDomainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessBrifMapper {
    long countByExample(BusinessBrifDomainExample example);

    int deleteByExample(BusinessBrifDomainExample example);

    int deleteByPrimaryKey(Integer businessBrifId);

    int insert(BusinessBrifDomain record);

    int insertSelective(BusinessBrifDomain record);

    List<BusinessBrifDomain> selectByExample(BusinessBrifDomainExample example);

    BusinessBrifDomain selectByPrimaryKey(Integer businessBrifId);

    int updateByExampleSelective(@Param("record") BusinessBrifDomain record, @Param("example") BusinessBrifDomainExample example);

    int updateByExample(@Param("record") BusinessBrifDomain record, @Param("example") BusinessBrifDomainExample example);

    int updateByPrimaryKeySelective(BusinessBrifDomain record);

    int updateByPrimaryKey(BusinessBrifDomain record);
}