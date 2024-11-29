package day05_jUnitFramework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_BeforeAll_AfterAll {

    // 3 farkli test method'u olusturarak asagidaki testleri gerceklestirin
    // 1- Test otomasyonu anasayfaya gidin
    //    Url'in test otomasyonu icerdigini test edin
    // 2- phone icin arama yapin
    //    ve arama sonucunda urun bulunabildigini test edin
    // 3- ilk urunu tiklayin
    //    ve acilan sayfadaki urun isminde case sensitive olmadan "phone" bulundugunu test edin

    /*
        Bu gorev icin
        her test method'undan sonra driver'i kapatmak (@AfterEach) mantikli olmaz

        bunun yerine
        class calismaya basladiginda hic bir method calismadan once driver'i olusturmak
        ve tum @Test method'lari calisip bittikten sonra
        calisacak @Test method'u kalmadiginda
        driver'i kapatmak daha mantikli olur

        Bu tur birbirinin sonucuna bagli test method'lari oldugunda
        JUnit ile method'lari tek tek run edebiliriz
        ancak method'un yapmasi gereken islevi yapmasi mumkun olmayabilir
     */
    WebDriver driver;

    @BeforeAll
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterAll
    public void teardown(){
        driver.quit();
    }

    @Test
    public void test01(){ // anasayfaTesti
        // 1- Test otomasyonu anasayfaya gidin
        //    Url'in test otomasyonu icerdigini test edin
    }

    @Test
    public void test02(){//urunAramaTesti
        // 2- phone icin arama yapin
        //    ve arama sonucunda urun bulunabildigini test edin
    }

    @Test
    public void test03(){//ilkUrunIsimTesti
        // 3- ilk urunu tiklayin
        //    ve acilan sayfadaki urun isminde case sensitive olmadan "phone" bulundugunu test edin
    }


}
