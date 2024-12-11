package day12_excel_getScreenshot_jsExecutors;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_WriteExcel {

    @Test
    public void writeExcelTesti() throws IOException {

        //3) Adimlari takip ederek Sayfa1’e kadar gidelim
        String dosyaYolu = "src/test/java/day11_WebTables_ExcelOtomasyon/ulkeler.xlsx";
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sayfa1 = workbook.getSheet("Sayfa1");

        //4) 1.satir 5.hucreye yeni bir cell olusturalim
        sayfa1.getRow(0).createCell(4);

        //5) Olusturdugumuz hucreye “Nufus” yazdiralim
        sayfa1.getRow(0).getCell(4).setCellValue("Nufus");

        //6) 2.satir nufus kolonuna 1500000 yazdiralim
        //7) 10.satir nufus kolonuna 250000 yazdiralim
        //8) 15.satir nufus kolonuna 54000 yazdiralim
        //9) Dosyayi kaydedelim
        //10)Dosyayi kapatalim
    }


}
