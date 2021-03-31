package com.bochtec.mysql.dao;

import com.bochtec.mysql.domain.CorpDomain;
import com.bochtec.mysql.domain.SellerDomain;
import com.bochtec.mysql.domain.SellerDomainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SellerMapper {
    long countByExample(SellerDomainExample example);

    int deleteByExample(SellerDomainExample example);

    int deleteByPrimaryKey(Integer sellerId);

    int insert(SellerDomain record);

    int insertSelective(SellerDomain record);

    List<SellerDomain> selectByExample(SellerDomainExample example);

    SellerDomain selectByPrimaryKey(Integer sellerId);

    int updateByExampleSelective(@Param("record") SellerDomain record, @Param("example") SellerDomainExample example);

    int updateByExample(@Param("record") SellerDomain record, @Param("example") SellerDomainExample example);

    int updateByPrimaryKeySelective(SellerDomain record);

    int updateByPrimaryKey(SellerDomain record);
    /**
     * 批量更新优化，支持多条;结尾MutQuery
     * @param list
     * @return
     */
    int updateBatch(List<SellerDomain> list);
}