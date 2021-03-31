//package com.bochtec.mysql;
//
//import com.bht.jni.MaskJni;
//import com.bochtec.clms.typehandlers.alias.ChineseCryptType;
//import com.bochtec.clms.utils.StringUtils;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.codec.binary.Base64;
//import org.apache.ibatis.type.BaseTypeHandler;
//import org.apache.ibatis.type.JdbcType;
//import org.apache.ibatis.type.MappedTypes;
//
//import java.sql.CallableStatement;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//@Slf4j
//@MappedTypes(ChineseCryptType.class)
//public class ChineseTypeHandler extends BaseTypeHandler<String> {
//
//    /**
//     * 新增插入时进行加密
//     *
//     * @param ps
//     * @param i
//     * @param s
//     * @param jdbcType
//     * @throws SQLException
//     */
//    @Override
//    public void setNonNullParameter(PreparedStatement ps, int i, String s, JdbcType jdbcType) throws SQLException {
//        try {
//            if (StringUtils.isNotEmpty(s)) {
//                //ps.setString(i, new String(MaskJni.UTF3BEncrypt(Base64.encodeBase64(s.getBytes()))));
//                ps.setString(i, s);
//            }
//        } catch (Exception e) {
//            log.error("加密失败：", e);
//            //加密失败，使用原数据
//            ps.setString(i, s);
//        }
//
//    }
//
//    /**
//     * 查询返回时解密
//     *
//     * @param resultSet
//     * @param columnName
//     * @return
//     * @throws SQLException
//     */
//    @Override
//    public String getNullableResult(ResultSet resultSet, String columnName) throws SQLException {
//        String name = resultSet.getString(columnName);
////        if (StringUtils.isNotEmpty(name)) {
////            return decrypt(name);
////        }
//        return name;
//    }
//
//    /**
//     * 解密
//     *
//     * @param param
//     * @return
//     */
//    public static String decrypt(String param) {
//        try {
//            byte[] result = Base64.decodeBase64(MaskJni.UTF3BDecrypt(param.getBytes()));
//            if (result.length > 0) {
//                return new String(result);
//            }else {
//                return param;
//            }
//        } catch (Exception e) {
//            log.error("解密失败：", e);
//            //解密失败，使用原数据
//            return param;
//        }
//
//    }
//
//    @Override
//    public String getNullableResult(ResultSet resultSet, int i) throws SQLException {
//        return null;
//    }
//
//    @Override
//    public String getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
//        return null;
//    }
//
//
//}
//
//
