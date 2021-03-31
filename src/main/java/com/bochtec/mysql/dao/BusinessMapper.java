package com.bochtec.mysql.dao;

import com.bochtec.mysql.domain.BusinessDomain;
import com.bochtec.mysql.domain.BusinessDomainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface BusinessMapper {
    long countByExample(BusinessDomainExample example);

    int deleteByExample(BusinessDomainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessDomain record);

    int insertSelective(BusinessDomain record);

    List<BusinessDomain> selectByExample(BusinessDomainExample example);

    BusinessDomain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessDomain record, @Param("example") BusinessDomainExample example);

    int updateByExample(@Param("record") BusinessDomain record, @Param("example") BusinessDomainExample example);

    int updateByPrimaryKeySelective(BusinessDomain record);

    int updateByPrimaryKey(BusinessDomain record);
    /**
     * 批量更新优化，支持多条;结尾MutQuery
     * @param list
     * @return
     */
    int updateBatch(List<BusinessDomain> list);
}