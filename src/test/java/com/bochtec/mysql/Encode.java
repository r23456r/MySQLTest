package com.bochtec.mysql;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.bht.jni.MaskJni;
import com.bochtec.mysql.dao.BusinessInfoMapper;
import com.bochtec.mysql.dao.BusinessMapper;
import com.bochtec.mysql.dao.CorpMapper;
import com.bochtec.mysql.dao.SellerMapper;
import com.bochtec.mysql.domain.BusinessDomain;
import com.bochtec.mysql.domain.BusinessInfoDomain;
import com.bochtec.mysql.domain.CorpDomain;
import com.bochtec.mysql.domain.SellerDomain;
import com.bochtec.mysql.util.ArraysUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: zhangyuhang
 * @modified By：
 * @date ：Created in 2020/12/23 13:54
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Encode {
    @Autowired
    private BusinessMapper businessMapper;
    @Autowired
    private SellerMapper sellerMapper;
    @Autowired
    private CorpMapper corpMapper;
    @Autowired
    private BusinessInfoMapper businessInfoMapper;

    @Test
    public void corpEncode() {
        MaskJni.VerifyPin(parseHexStr2Byte("D8FF9FC9691F33CB3286E51BC013DD70"));
        log.info(new String(MaskJni.GetJNIVersion()));
        //tb_corp
        log.info("tb_corp 开始");
        List<CorpDomain> corpDomains = corpMapper.selectByExample(null);
        corpDomains
                .forEach(corpDomain -> {
                    // corp_name 汉字 UTF3BEncrypt
                    String corpName = corpDomain.getCorpName();
                    if (StringUtils.isNotBlank(corpName)) {
                        String cipherCorpName = new String(MaskJni.UTF3BEncrypt(Base64.getEncoder().encode(corpName.getBytes(StandardCharsets.UTF_8))));
                        corpDomain.setCorpName(cipherCorpName);
                    }
                    // social_code 数字字母 AlphanumEncrypt
                    String socialCode = corpDomain.getSocialCode();
                    if (StringUtils.isNotBlank(socialCode)) {
                        String cipherSocialCode = new String(MaskJni.AlphanumEncrypt(socialCode.getBytes()));
                        corpDomain.setSocialCode(cipherSocialCode);
                    }
                });
        //目标List分7000份
        int average = 7000;
        List<List<CorpDomain>> lists = ArraysUtils.averageAssign(corpDomains, average);
        log.info("List总数" + corpDomains.size() + "拆分份数：" + average);
        lists.forEach(list -> {
            if (list.size() > 0) {
                long start = System.currentTimeMillis();
//                corpMapper.updateBatch(list);
                for (CorpDomain domain : list) {
                    corpMapper.updateByPrimaryKey(domain);
                }
                long end = System.currentTimeMillis();
                log.info("当前size: " + list.size() + "ms," + "耗时：" + (end - start));
            }
        });
        log.info(" tb_corp 结束");
    }


    @Test
    public void businessInfoEncode() {
        MaskJni.VerifyPin(parseHexStr2Byte("D8FF9FC9691F33CB3286E51BC013DD70"));
        log.info(new String(MaskJni.GetJNIVersion()));
        //tb_business_info
        log.info("tb_business_info 开始");
        List<BusinessInfoDomain> infoDomains = businessInfoMapper.selectByExample(null);
        infoDomains
                .forEach(businessDomain -> {
                    // shop_name 中文 UTF3BEncrypt
                    String shopName = businessDomain.getShopName();
                    if (StringUtils.isNotBlank(shopName)) {
                        String cipherShopName = new String(
                                MaskJni.UTF3BEncrypt(Base64.getEncoder().encode(shopName.getBytes(StandardCharsets.UTF_8))));
                        businessDomain.setShopName(cipherShopName);
                    }
                    // business_license 字母数字 AlphanumEncrypt
                    String businessLicense = businessDomain.getBusinessLicense();
                    if (StringUtils.isNotBlank(businessLicense)) {
                        String cipherLicenceName = new String(MaskJni.AlphanumEncrypt(businessLicense.getBytes()));
                        businessDomain.setBusinessLicense(cipherLicenceName);
                    }
                    // organization_code 字母数字 AlphanumEncrypt
                    String organizationCode = businessDomain.getOrganizationCode();
                    if (StringUtils.isNotBlank(organizationCode)) {
                        String cipherOrganizeName = new String(MaskJni.AlphanumEncrypt(organizationCode.getBytes()));
                        businessDomain.setBusinessLicense(cipherOrganizeName);
                    }

                });

        //目标List分7000份
        int average = 45;
        List<List<BusinessInfoDomain>> lists = ArraysUtils.averageAssign(infoDomains, average);
        log.info("List总数" + infoDomains.size() + "拆分份数：" + average);
//        lists.forEach(list -> {
//            if (list.size() > 0) {
//                long start = System.currentTimeMillis();
//                businessInfoMapper.updateBatch(list);
//                long end = System.currentTimeMillis();
//                log.info("当前size: " + list.size() + "ms," + "耗时：" + (end - start));
//            }
//        });
        for (List<BusinessInfoDomain> list : lists) {
            for (BusinessInfoDomain domain : list) {
                businessInfoMapper.updateByPrimaryKey(domain);
            }
        }

        log.info(" tb_business_info 结束");
    }

    @Test
    public void businessEncode() {
        MaskJni.VerifyPin(parseHexStr2Byte("D8FF9FC9691F33CB3286E51BC013DD70"));
        log.info(new String(MaskJni.GetJNIVersion()));
        //tb_business
        log.info("tb_business 开始");
        List<BusinessDomain> businessDomains = businessMapper.selectByExample(null);
        businessDomains
                .forEach(businessDomain -> {
                    // company_name 汉字 UTF3BEncrypt
                    String companyName = businessDomain.getCompanyName();
                    if (StringUtils.isNotBlank(companyName)) {
                        String cipherCompanyName = new String(
                                MaskJni.UTF3BEncrypt(Base64.getEncoder().encode(companyName.getBytes(StandardCharsets.UTF_8))));
                        businessDomain.setCompanyName(cipherCompanyName);
                    }
                    // social_code 数字字母 AlphanumEncrypt
                    String socialCode = businessDomain.getSocialCode();
                    if (StringUtils.isNotBlank(socialCode)) {
                        String cipherSocialCode = new String(MaskJni.AlphanumEncrypt(socialCode.getBytes()));
                        businessDomain.setSocialCode(cipherSocialCode);
                    }
                });

        //目标List分7000份
        int average = 10;
        List<List<BusinessDomain>> lists = ArraysUtils.averageAssign(businessDomains, average);
        log.info("List总数" + businessDomains.size() + "拆分份数：" + average);
        lists.forEach(list -> {
            if (list.size() > 0) {
                long start = System.currentTimeMillis();
                for (BusinessDomain domain : list) {
                    businessMapper.updateByPrimaryKey(domain);
                }
//                businessMapper.updateBatch(list);
                long end = System.currentTimeMillis();
                log.info("当前size: " + list.size() + "ms," + "耗时：" + (end - start));
            }
        });
        log.info(" tb_business 结束");
    }

    /**
     * tb_seller 加密
     */
//    @Test
    public void sellerEncode() {
        MaskJni.VerifyPin(parseHexStr2Byte("D8FF9FC9691F33CB3286E51BC013DD70"));
        log.info(new String(MaskJni.GetJNIVersion()));
        //tb_seller
        log.info("tb_seller 开始");
        List<SellerDomain> sellerDomains = sellerMapper.selectByExample(null);
        sellerDomains
                .forEach(sellerDomain -> {
                    // group_name 汉字（包含已加密） UTF3BEncrypt
                    String groupName = sellerDomain.getGroupName();
                    if (StringUtils.isNotBlank(groupName)) {
                        String cipherName = new String(
                                MaskJni.UTF3BEncrypt(Base64.getEncoder().encode(groupName.getBytes(StandardCharsets.UTF_8))));
                        sellerDomain.setGroupName(cipherName);
                    }
                });
        for (SellerDomain domain : sellerDomains) {
            sellerMapper.updateByPrimaryKey(domain);
        }
        log.info(" tb_seller 结束");
    }

    /**
     * tb_seller 解密并清洗
     * 解密并置空不包含汉字的字段
     */
//    @Test
    public void sellerDecode() {
        MaskJni.VerifyPin(parseHexStr2Byte("D8FF9FC9691F33CB3286E51BC013DD70"));
        log.info(new String(MaskJni.GetJNIVersion()));
        //tb_seller
        log.info("tb_seller 数据清洗 开始");
        List<SellerDomain> sellerDomains = sellerMapper.selectByExample(null);
        sellerDomains
                .forEach(sellerDomain -> {
                    String groupName = sellerDomain.getGroupName();
                    if (StringUtils.isNotBlank(groupName)) {
                        String plaintName = new String(Base64.getDecoder().decode(MaskJni.UTF3BDecrypt(groupName.getBytes())), StandardCharsets.UTF_8);
                        if (!hasChinese(plaintName)) {
                            plaintName = null;
                        }
                        sellerDomain.setGroupName(plaintName);
                    }
                });
        for (SellerDomain domain : sellerDomains) {
            sellerMapper.updateByPrimaryKey(domain);
        }
        log.info(" tb_seller 数据清洗 结束");
    }

    /**
     * 将16进制转换为二进制
     *
     * @param hexStr
     * @return
     */
    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1)
            return null;
        byte[] result = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; i++) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2),
                    16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }

    /**
     * 根据正则表达式判断字符是否为汉字
     * 字符串中包含汉字时返回true
     */
    public static boolean hasChinese(String value) {

        // 汉字的Unicode取值范围
        String regex = "[\u4e00-\u9fa5]";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(value);

        return match.find();

    }
}
