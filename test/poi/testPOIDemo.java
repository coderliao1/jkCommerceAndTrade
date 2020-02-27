package poi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class testPOIDemo {
    @Test
    public void HSSF() throws IOException {
        //1.创建一个工作簿excel文件
        Workbook wb = new XSSFWorkbook();
        //2.创建一个工作表Sheet
        Sheet sheet = wb.createSheet("demo");
        //3.创建一个行对象row
        Row row = sheet.createRow(3);
        //4.指定列，创建单元格对象
        Cell cell = row.createCell(4);
        //5.给单元格设置内容
        cell.setCellValue("this is demo");
        //6.通过输出流保存
        OutputStream os = new FileOutputStream("d:\\test.poi.xlsx");
        wb.write(os);
        //7.关闭流
        os.close();

    }
    @Test
    public void HSSFStyle() throws Exception{
        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("demo");
        Row row = sheet.createRow(3);
        Cell cell = row.createCell(4);
        cell.setCellValue("this is demo");

        //创建单元格样式
        CellStyle titlestyle = wb.createCellStyle();
        //创建一个字体对象
        Font titleFont = wb.createFont();
        titleFont.setFontName("华文行楷");
        titleFont.setFontHeightInPoints((short) 26);

        titlestyle.setFont(titleFont);

        cell.setCellStyle(titlestyle);

        OutputStream os = new FileOutputStream("d:\\testStyle.poi.xlsx");
        wb.write(os);

        os.close();

    }
}



