package com.apertus;

        import org.junit.AfterClass;
        import org.junit.Before;
        import org.junit.BeforeClass;
        import org.junit.Test;
        import org.openqa.selenium.*;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.interactions.Actions;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import java.lang.*;
        import static org.junit.Assert.assertFalse;
        import static org.junit.Assert.assertTrue;

public class InputTest {
    private static WebDriver driver;
    private static Actions action;
    private static WebDriverWait wait;
    private static JavascriptExecutor jsExec = (JavascriptExecutor)driver;

    @BeforeClass
    public static void setUpOnce() {
        System.setProperty("webdriver.chrome.driver", "d:\\Repositories\\chromedriver.exe");  //this must set
        driver = new ChromeDriver();
        action = new Actions(driver);
        wait = new WebDriverWait(driver, 6);
        driver.manage().window().maximize();

    }

    @Before
    public void SetUpURL() {

        driver.get("https://probono.uni-nke.hu/apps/programkereso-uj/#/programok");

    }

    //SLEEP
    public static void sleep(int x) {
        try {
            Thread.sleep(x);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void FirstTest() {

        driver.findElement(By.xpath("//span[@aria-controls='collapseProgramKereso']")).click();
        WebElement kompetenciak = driver.findElement(By.xpath("//div[@aria-controls='collapseOne']"));
        WebElement programNev = driver.findElement(By.xpath("//input[@id='filter_programNev']"));
        WebElement programGazda = driver.findElement(By.xpath("//span[@id='select2-filter_programGazdaId-container']"));
        WebElement programNyilvantartasiSzam = driver.findElement(By.xpath("//input[@id='filter_programNyilvszam']"));
        WebElement oraszam = driver.findElement(By.xpath("//span[@id='select2-filter_selectedOra-container']"));
        WebElement tanulmenyiPontszam = driver.findElement(By.xpath("//span[@id='select2-filter_selectedKredit-container']"));


        //kompetenciak.click();
        //driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[3]/span/input")).click();

        programNev.click();
        programNev.clear();
        programNev.sendKeys("\"A helyi önkormányzatok törvényességi felügyeletével összefüggő írásbeli kapcsolattartás\" rendszerének gyakorlati bemutatása");

        programGazda.click();
        WebElement programGazdaInput = driver.findElement(By.xpath("//input[@role='textbox']"));
        programGazdaInput.click();
        programGazdaInput.clear();
        programGazdaInput.sendKeys("NÓGRÁD MEGYEI KORMÁNYHIVATAL");

        programNyilvantartasiSzam.click();
        programNyilvantartasiSzam.clear();
        programNyilvantartasiSzam.sendKeys("PM-0733-1404-BS");

        oraszam.click();
        WebElement oraszamInput = driver.findElement(By.xpath("//input[@autocapitalize='off']"));
        oraszamInput.click();
        oraszamInput.clear();
        oraszamInput.sendKeys("8");
        oraszamInput.sendKeys(Keys.ENTER);

        tanulmenyiPontszam.click();
        WebElement tanulmenyiPontszamInput = driver.findElement(By.xpath("//input[@autocapitalize='off']"));
        tanulmenyiPontszamInput.click();
        tanulmenyiPontszamInput.clear();
        tanulmenyiPontszamInput.sendKeys("9");
        tanulmenyiPontszamInput.sendKeys(Keys.ENTER);

        WebElement koltseg = driver.findElement(By.xpath("//span[@id='select2-filter_selectedKoltseg-container']"));
        koltseg.click();
        WebElement koltsegInput = driver.findElement(By.xpath("//input[@autocapitalize='off']"));
        koltsegInput.click();
        koltsegInput.clear();
        koltsegInput.sendKeys("nem");
        koltsegInput.sendKeys(Keys.ENTER);

        WebElement programCsoport = driver.findElement(By.xpath("//span[@id='select2-filter_selectedPrgcsop-container']"));
        programCsoport.click();
        WebElement programCsoportInput = driver.findElement(By.xpath("//input[@autocapitalize='off']"));
        programCsoportInput.click();
        programCsoportInput.clear();
        programCsoportInput.sendKeys("b");
        programCsoportInput.sendKeys(Keys.ENTER);

        WebElement szervezetreKorlatozott = driver.findElement(By.xpath("//span[@id='select2-filter_selectedSzervezetreKorlatozott-container']"));
        szervezetreKorlatozott.click();
        WebElement szervezetreKorlatozottInput = driver.findElement(By.xpath("//input[@autocapitalize='off']"));
        szervezetreKorlatozottInput.click();
        szervezetreKorlatozottInput.clear();
        szervezetreKorlatozottInput.sendKeys("i");
        szervezetreKorlatozottInput.sendKeys(Keys.ENTER);


        WebElement ELearning = driver.findElement(By.xpath("//label[@id='btnSecondaryElearning']"));
        WebElement jelenleti = driver.findElement(By.xpath("//label[@id='btnSecondaryJelenleti']"));
        WebElement blended = driver.findElement(By.xpath("//label[@id='btnSecondaryBlended']"));
        ELearning.click();
        jelenleti.click();
        blended.click();

        WebElement telepules = driver.findElement(By.xpath("//span[@id='select2-filter_telepulesId-container']"));
        telepules.click();
        WebElement telepulesInput = driver.findElement(By.xpath("//input[@autocapitalize='off']"));
        telepulesInput.click();
        telepulesInput.clear();
        telepulesInput.sendKeys("de");
        telepulesInput.sendKeys(Keys.ENTER);


        WebElement hatalyossagKezdete = driver.findElement(By.xpath("//p-calendar[@id='filter_hatKezd']/span/input"));
        hatalyossagKezdete.click();
        hatalyossagKezdete.clear();
        hatalyossagKezdete.sendKeys("2017.06.27");
        hatalyossagKezdete.sendKeys(Keys.ENTER);

        WebElement targyevbenIndul = driver.findElement(By.xpath("//p-checkbox[@id='filter_targyevbenIndul']/div/div[2]"));
        targyevbenIndul.click();

        WebElement kereses = driver.findElement(By.xpath("//button[@type='submit']"));
        kereses.click();

        sleep(3000);
        assertTrue("nem jelent meg a program",driver.findElement(By.xpath("//td[contains(.,'PM-0733-1404-BS')]")).isDisplayed());
        assertTrue("Nincs adat",driver.findElement(By.xpath("//div[@class='alert alert-info']")).isDisplayed());

    }

    @AfterClass
    public static void tearDownOnce() {
        //driver.close();
    }
}
