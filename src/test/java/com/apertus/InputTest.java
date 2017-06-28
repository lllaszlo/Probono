package com.apertus;

import com.apertus.helper.FillInput;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static com.apertus.helper.ThreadSleepSupport.sleep;

public class InputTest {
    private static WebDriver driver;
    private FillInput fillinput;

    @BeforeClass
    public static void setUpOnce() {
        System.setProperty("webdriver.chrome.driver", "d:\\Repositories\\chromedriver.exe");  //this must set
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before
    public void SetUpURL() {
        fillinput = new FillInput(driver);
        driver.get("https://probono.uni-nke.hu/apps/programkereso-uj/#/programok");
        driver.findElement(By.xpath("//span[@aria-controls='collapseProgramKereso']")).click();
    }

    @Test
    public void FirstTest() {

        //SETUP INPUTS
        FillInput.kompetenciak(5);
        FillInput.kompetenciak(10);
        FillInput.kompetenciak(2);
        FillInput.kompetenciak(32);
        FillInput.programNev("\"A helyi önkormányzatok törvényességi felügyeletével összefüggő írásbeli kapcsolattartás\" rendszerének gyakorlati bemutatása");
        FillInput.programGazda("NÓGRÁD MEGYEI KORMÁNYHIVATAL");
        FillInput.programNyilvantartasiSzam("PM-0733-1404-BS");
        FillInput.oraszam("1");
        FillInput.tanulmanyiPontszam("9");
        FillInput.koltseg("terit");
        FillInput.programCsoport("k");
        FillInput.szervezetreKorlatozott("igen");
        FillInput.ELearning();
        FillInput.jelenleti();
        FillInput.blended();
        FillInput.telepules("deb");
        FillInput.hatalyossagKezdete("2017.06.27");
        FillInput.targyevbenIndul();

        //LAUNCH SUBMIT
        FillInput.kereses();

        //EXPECTED RESULTS
        sleep(1000);
        assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-info']")).isDisplayed());
    }

    @Test
    public void SecondTest() {

        //SETUP INPUTS
        FillInput.programNev("\"A helyi önkormányzatok törvényességi felügyeletével összefüggő írásbeli kapcsolattartás\" rendszerének gyakorlati bemutatása");
        FillInput.programGazda("NÓGRÁD MEGYEI KORMÁNYHIVATAL");
        FillInput.programNyilvantartasiSzam("PM-0733-1404-BS");

        //LAUNCH SUBMIT
        FillInput.kereses();

        //EXPECTED RESULTS
        sleep(1000);
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'PM-0733-1404-BS')]")).isDisplayed());
    }

    @Test
    public void ThirdTest() {

        //SETUP INPUTS
        FillInput.programGazda("EMBERI ERŐFORRÁSOK MINISZTÉRIUMA");
        FillInput.koltseg("nem");
        FillInput.programCsoport("bel");
        FillInput.ELearning();

        //LAUNCH SUBMIT
        FillInput.kereses();

        //EXPECTED RESULTS
        sleep(1000);
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'PM-1788-1501-BS')]")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'PM-1789-1501-BS')]")).isDisplayed());
    }

    @Test
    public void FourthTest() {

        //SETUP INPUTS
        FillInput.kompetenciak(14);
        FillInput.programGazda("NEMZETI KÖZSZOLGÁLATI EGYETEM");
        FillInput.programNyilvantartasiSzam("PN-0191-1401-MK");
        FillInput.oraszam("1");
        FillInput.koltseg("norm");
        FillInput.ELearning();
        FillInput.targyevbenIndul();

        //LAUNCH SUBMIT
        FillInput.kereses();

        //EXPECTED RESULTS
        sleep(1000);
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'PN-0191-1401-MK')]")).isDisplayed());
    }

    @Test
    public void FifthTest() {

        //SETUP INPUTS
        FillInput.programNev("Anyakönyvi szakvizsga felkészítő tanfolyam");
        FillInput.programGazda("CSONGRÁD MEGYEI KORMÁNYHIVATAL");
        FillInput.programNyilvantartasiSzam("PM-2283-1703-BS");
        FillInput.oraszam("65");
        FillInput.tanulmanyiPontszam("33");
        FillInput.koltseg("nem");
        FillInput.programCsoport("bel");
        FillInput.szervezetreKorlatozott("nem");
        FillInput.jelenleti();
        FillInput.telepules("szeg");
        FillInput.hatalyossagKezdete("2016.06.27");

        //LAUNCH SUBMIT
        FillInput.kereses();

        //EXPECTED RESULTS
        sleep(1000);
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'PM-2283-1703-BS')]")).isDisplayed());
    }

    @Test
    public void SixthTest() {

        //SETUP INPUTS
        FillInput.kompetenciak(34);
        FillInput.kompetenciak(35);
        FillInput.programNev("123456789");
        FillInput.programGazda("22");
        FillInput.programNyilvantartasiSzam("asdfghjkl");
        FillInput.oraszam("50");
        FillInput.tanulmanyiPontszam("150");
        FillInput.koltseg("oi");
        FillInput.programCsoport("ert");
        FillInput.szervezetreKorlatozott("yes");
        FillInput.ELearning();
        FillInput.jelenleti();
        FillInput.blended();
        FillInput.telepules("qwe");
        FillInput.hatalyossagKezdete("2017.13.27");
        FillInput.targyevbenIndul();

        //LAUNCH SUBMIT
        FillInput.kereses();

        //EXPECTED RESULTS
        sleep(1000);
        assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-info']")).isDisplayed());
    }

    @Test
    public void SeventhTest() {

        //SETUP INPUTS
        FillInput.kompetenciak(1);
        FillInput.kompetenciak(2);
        FillInput.kompetenciak(3);
        FillInput.kompetenciak(4);
        FillInput.kompetenciak(5);
        FillInput.kompetenciak(6);
        FillInput.kompetenciak(7);
        FillInput.kompetenciak(8);
        FillInput.kompetenciak(9);
        FillInput.kompetenciak(10);
        FillInput.oraszam("17");
        FillInput.tanulmanyiPontszam("33");
        FillInput.koltseg("norm");
        FillInput.programCsoport("k");
        FillInput.szervezetreKorlatozott("nem");
        FillInput.ELearning();
        FillInput.jelenleti();
        FillInput.blended();
        FillInput.telepules("buda");
        FillInput.hatalyossagKezdete("2015.01.01");
        FillInput.targyevbenIndul();

        //LAUNCH SUBMIT
        FillInput.kereses();

        //EXPECTED RESULTS
        sleep(1000);
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'PN-0320-1411-MV')]")).isDisplayed());
    }

    @AfterClass
    public static void tearDownOnce() {
        //driver.close();
    }
}
