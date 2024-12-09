package day10_waits_cookies;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

import java.util.Set;

public class C04_Cookies extends TestBaseEach {

    @Test
    public void test01(){

        // Google'a gidelim
        driver.get("https://www.google.com");


        // cookies cikarsa kabul edin

        driver.findElement(By.xpath("//div[.='Accept all']"))
                .click();

        // syfada kac adet cookies bulundugunu yazdirin

        Set<Cookie> tumCookieSeti  = driver.manage().getCookies();

        System.out.println("Sayfadaki cookie adedi : " + tumCookieSeti.size()); // 3

        // sayfadaki cookie'leri yazdirin




        ReusableMethods.bekle(3);
    }
}
