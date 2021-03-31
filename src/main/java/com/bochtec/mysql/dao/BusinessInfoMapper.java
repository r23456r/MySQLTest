package com.bochtec.mysql.dao;

import com.bochtec.mysql.domain.BusinessInfoDomain;
import com.bochtec.mysql.domain.BusinessInfoDomainExample;
import java.util.List;

import com.bochtec.mysql.domain.CorpDomain;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface BusinessInfoMapper {
    long countByExample(BusinessInfoDomainExample example);

    int deleteByExample(BusinessInfoDomainExample example);

    int deleteByPrimaryKey(Integer businessId);

    int insert(BusinessInfoDomain record);

    int insertSelective(BusinessInfoDomain record);

    List<BusinessInfoDomain> selectByExample(BusinessInfoDomainExample example);

    BusinessInfoDomain selectByPrimaryKey(Integer businessId);

    int updateByExampleSelective(@Param("record") BusinessInfoDomain record, @Param("example") BusinessInfoDomainExample example);

    int updateByExample(@Param("record") BusinessInfoDomain record, @Param("example") BusinessInfoDomainExample example);

    int updateByPrimaryKeySelective(BusinessInfoDomain record);

    int updateByPrimaryKey(BusinessInfoDomain record);
    /**
     * 批量更新优化，支持多条;结尾MutQuery
     * @param list
     * @return
     */
    int updateBatch(List<BusinessInfoDomain> list);
}