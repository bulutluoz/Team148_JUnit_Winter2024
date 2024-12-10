package day11_WebTables_ExcelOtomasyon;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ReadExcel {

    @Test
    public void test01() throws IOException {

        // Excel'deki bilgileri kullanabilmek icin
        // once excel'deki datalara ulasmamiz lazim
        // bilgisayarimizdaki dosyaya selenium WebDriver ile ulasamayacagimiz icin
        // Java'dan yardim istemeliyiz

        // 1.adim dosya yolunu alalim
        String dosyaYolu = "src/test/java/day11_WebTables_ExcelOtomasyon/ulkeler.xlsx";

        // 2.adim Java ile dosyaya erismek icin
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

        // 3.adim Excel'den alinan bilgileri
        //   kodlarimizin icinde olusturacagimiz bir obje olarak kaydedelim
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        // Artik fiziki excel dosyasindaki tum bilgileri
        // kodlarimiz icersinde olusturdugumuz workbook objesine kaydettik.

        // 4.adim excel'in kopyasi olan workbook'da
        //        istedigimiz bilgiye ulasalim

        Sheet sheet1 = workbook.getSheet("Sayfa1");




    }
}
