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
    }

    @Test
    public void FirstTest() {

        driver.findElement(By.xpath("//span[@aria-controls='collapseProgramKereso']")).click();

        FillInput.kompetenciak(5);
        FillInput.programNev("\"A helyi önkormányzatok törvényességi felügyeletével összefüggő írásbeli kapcsolattartás\" rendszerének gyakorlati bemutatása");
        FillInput.programGazda("NÓGRÁD MEGYEI KORMÁNYHIVATAL");
        FillInput.programNyilvantartasiSzam("PM-0733-1404-BS");
        FillInput.oraszam("1");
        FillInput.tanulmenyiPontszam("9");
        FillInput.koltseg("terit");
        FillInput.programCsoport("k");
        FillInput.szervezetreKorlatozott("igen");
        FillInput.ELearning(true);
        FillInput.jelenleti(true);
        FillInput.blended(true);
        FillInput.telepules("deb");
        FillInput.hatalyossagKezdete("2017.06.27");
        FillInput.targyevbenIndul(false);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        sleep(1000);
        assertTrue("Nincs adat",driver.findElement(By.xpath("//div[@class='alert alert-info']")).isDisplayed());
    }

    @Test
    public void SecondTest() {

        driver.findElement(By.xpath("//span[@aria-controls='collapseProgramKereso']")).click();

        FillInput.programNev("\"A helyi önkormányzatok törvényességi felügyeletével összefüggő írásbeli kapcsolattartás\" rendszerének gyakorlati bemutatása");
        FillInput.programGazda("NÓGRÁD MEGYEI KORMÁNYHIVATAL");
        FillInput.programNyilvantartasiSzam("PM-0733-1404-BS");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        sleep(1000);
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'PM-0733-1404-BS')]")).isDisplayed());

    }

    @AfterClass
    public static void tearDownOnce() {
        //driver.close();
    }
}
