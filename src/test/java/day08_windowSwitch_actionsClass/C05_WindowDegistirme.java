package day08_windowSwitch_actionsClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

public class C05_WindowDegistirme extends TestBaseEach {

    @Test
    public void test01(){

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");

        // sayfadaki elemental selenium linkini tiklayin
        driver.findElement(By.xpath("//*[text()='Elemental Selenium']"))
                .click();

        // acilan yeni window'da buyuk basligin "Elemental Selenium" oldugunu test edin
        ReusableMethods.urlIleWindowDegistir(driver,"https://elementalselenium.com/");

        String expectedYazi = "Elemental Selenium";
        String actualYazi = driver.findElement(By.tagName("h1")).getText();

        Assertions.assertEquals(expectedYazi,actualYazi);


        // ilk window'a geri donun


        // "Opening a new window" yazisinin gorunur oldugunu test edin


        // Click here'a basin


        // Acilan yeni window'a gecip, oradaki yazinin "New Window" oldugunu test edin


        // Elemental selenium'un acik oldugu window'a gecip
        // Tips linkinin erisilebilir oldugunu test edin

        ReusableMethods.bekle(2);

    }
}
