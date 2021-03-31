package com.bochtec.mysql.controller;

import com.bochtec.mysql.dao.Base64Mapper;
import com.bochtec.mysql.dao.TestMapper;
import com.bochtec.mysql.domain.Base64Domain;
import com.bochtec.mysql.domain.Base64DomainExample;
import com.bochtec.mysql.util.HanZiDecode;
import com.bochtec.mysql.util.HanZiEncode;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zhangyuhang
 * @modified By：
 * @date ：Created in 2020/6/12 15:19
 **/
@RestController
@RequestMapping("/mysql")
public class JiShuQi {
    private Logger logger = LoggerFactory.getLogger(JiShuQi.class);

    @Autowired
    private TestMapper testMapper;
    @Autowired
    private Base64Mapper base64Mapper;

    @RequestMapping("/count")

    public void count() {
        testMapper.count();
    }

    @PostMapping("/base64/select")
    public List<Base64Domain> select(String str) {
        Base64DomainExample example = new Base64DomainExample();
        String encode = HanZiEncode.encode(str);
        logger.info("-----------" + encode);
        example.createCriteria().andBase64Like('%' + encode + '%');
        List<Base64Domain> domains = base64Mapper.selectByExample(example);
        for (Base64Domain domain : domains) {
            domain.setBase64(HanZiDecode.decode(domain.getBase64()));
        }
        return domains;
    }

    @RequestMapping("/base64/insert")
    public Integer insert(String str) {
        Base64Domain domain = new Base64Domain();
        domain.setBase64(HanZiEncode.encode(str));
        return base64Mapper.insert(domain);
    }

    @RequestMapping("/maskJni")
    public Integer maskJni() {
        return null;
    }
}
