package com.bochtec.mysql;

import com.bochtec.mysql.dao.IndustryInfoMapper;
import com.bochtec.mysql.dao.IndustryMapper;
import com.bochtec.mysql.domain.IndustryDomain;
import com.bochtec.mysql.domain.IndustryInfoDomain;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ResourceUtils;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

/**
 * @author: zhangyuhang
 * @modified By：
 * @date ：Created in 2020/6/15 18:19
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MysqlApplication.class)
public class Test01 {

    @Autowired
    private IndustryInfoMapper industryInfoMapper;

    @Autowired
    private IndustryMapper industryMapper;


    //读取单个单元格
//    @Test
//    @Transactional(rollbackFor = Exception.class)
    public void testRead() throws Exception {


        Workbook book = null;
        try {
            book = new XSSFWorkbook(ResourceUtils.getFile("classpath:format.xlsx"));
        } catch (Exception e) {
            book = new HSSFWorkbook(new FileInputStream(ResourceUtils.getFile("classpath:format.xlsx")));
        }

        //Excel工作表
        Sheet sheet = book.getSheetAt(0);
        List<Integer> ids = Arrays.asList(2, 7, 14, 45, 48, 52, 54, 62, 64, 67, 71, 72, 74, 77, 81, 84, 85, 87, 92, 98, 99, 100);
        try {
            for (int i = 0; i < ids.size(); i++) {

                int parentid = i + 1;
                String parentName = sheet.getRow(ids.get(i) - 1).getCell(0).getStringCellValue();
                System.out.println(parentid + "------------------" + "(" + parentName + ")" + "------------------");

                for (int i1 = 0; i1 < (ids.get(i + 1) - ids.get(i)); i1++) {

                    int row = ids.get(i) - 1 + i1;
                    Row titleRow = sheet.getRow(row);
                    int cell = 1;
                    Cell titleCell = titleRow.getCell(cell);

                    int industryId = (int) titleCell.getNumericCellValue();
                    String industryName = titleRow.getCell(2).getStringCellValue();
                    System.out.println("(" + row + "," + cell + ")" + industryId + "--" + industryName);

                    IndustryInfoDomain infoDomin = new IndustryInfoDomain();

                    infoDomin.setIndustryId(industryId);
                    infoDomin.setIndustryDesc(industryName);
                    infoDomin.setIndustryName(industryName);
                    infoDomin.setParentId(parentid);


                    industryInfoMapper.insert(infoDomin);
                }
                IndustryDomain industryDomain = new IndustryDomain();
                industryDomain.setIndustryDesc(parentName);
                industryDomain.setIndustryId(parentid);
                industryDomain.setIndustryName(parentName);
                industryMapper.insert(industryDomain);
            }
        } catch (Exception e) {
            System.out.println("哎呦 gg");
        }
    }

}
