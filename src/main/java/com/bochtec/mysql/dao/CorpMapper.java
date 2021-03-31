package com.bochtec.mysql.dao;

import com.bochtec.mysql.domain.CorpDomain;
import com.bochtec.mysql.domain.CorpDomainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface CorpMapper {
    long countByExample(CorpDomainExample example);

    int deleteByExample(CorpDomainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CorpDomain record);

    int insertSelective(CorpDomain record);

    List<CorpDomain> selectByExample(CorpDomainExample example);

    CorpDomain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CorpDomain record, @Param("example") CorpDomainExample example);

    int updateByExample(@Param("record") CorpDomain record, @Param("example") CorpDomainExample example);

    int updateByPrimaryKeySelective(CorpDomain record);

    int updateByPrimaryKey(CorpDomain record);

    /**
     * 批量更新优化，支持多条;结尾MutQuery
     * @param list
     * @return
     */
    int updateBatch(List<CorpDomain> list);
}