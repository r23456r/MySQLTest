//package com.bochtec.mysql;
//
//import com.bht.jni.MaskJni;
//import com.bochtec.clms.typehandlers.alias.AlphaNumberType;
//import com.bochtec.clms.utils.StringUtils;
//import lombok.extern.slf4j.Slf4j;
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
//@MappedTypes(AlphaNumberType.class)
//public class AlphaNumTypeHandler extends BaseTypeHandler<String> {
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
//                //ps.setString(i, new String(MaskJni.AlphanumEncrypt(s.getBytes())));
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
//    private String decrypt(String param) {
//        try {
//            byte[] result = MaskJni.AlphanumDecrypt(param.getBytes());
//            return new String(result);
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
