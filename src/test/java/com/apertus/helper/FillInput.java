package com.apertus.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.apertus.helper.ThreadSleepSupport.sleep;


public class FillInput {
    private static WebDriver driver;

    public FillInput(WebDriver driver) {
        FillInput.driver = driver;
    }

    public static void kompetenciak(int x) {
        driver.findElement(By.xpath("//div[@aria-controls='collapseOne']")).click();
        sleep(1000);
        switch (x) {
            case 1:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[1]/span/input")).click();
                break;
            case 2:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[2]/span/input")).click();
                break;
            case 3:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[3]/span/input")).click();
                break;
            case 4:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[4]/span/input")).click();
                break;
            case 5:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[5]/span/input")).click();
                break;
            case 6:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[6]/span/input")).click();
                break;
            case 7:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[7]/span/input")).click();
                break;
            case 8:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[8]/span/input")).click();
                break;
            case 9:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[9]/span/input")).click();
                break;
            case 10:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[10]/span/input")).click();
                break;
            case 11:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[11]/span/input")).click();
                break;
            case 12:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[12]/span/input")).click();
                break;
            case 13:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[13]/span/input")).click();
                break;
            case 14:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[14]/span/input")).click();
                break;
            case 15:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[15]/span/input")).click();
                break;
            case 16:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[16]/span/input")).click();
                break;
            case 17:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[17]/span/input")).click();
                break;
            case 18:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[18]/span/input")).click();
                break;
            case 19:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[19]/span/input")).click();
                break;
            case 20:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[20]/span/input")).click();
                break;
            case 21:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[21]/span/input")).click();
                break;
            case 22:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[22]/span/input")).click();
                break;
            case 23:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[23]/span/input")).click();
                break;
            case 24:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[24]/span/input")).click();
                break;
            case 25:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[25]/span/input")).click();
                break;
            case 26:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[26]/span/input")).click();
                break;
            case 27:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[27]/span/input")).click();
                break;
            case 28:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[28]/span/input")).click();
                break;
            case 29:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[29]/span/input")).click();
                break;
            case 30:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[30]/span/input")).click();
                break;
            case 31:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[31]/span/input")).click();
                break;
            case 32:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[32]/span/input")).click();
                break;
            case 33:
                driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[33]/span/input")).click();
                break;
        }
    }

    public static void programNev(String x) {
        WebElement programNev = driver.findElement(By.xpath("//input[@id='filter_programNev']"));
        programNev.click();
        programNev.clear();
        programNev.sendKeys(x);
    }

    public static void programGazda(String x) {
        driver.findElement(By.xpath("//span[@id='select2-filter_programGazdaId-container']")).click();
        WebElement programGazdaInput = driver.findElement(By.xpath("//input[@role='textbox']"));
        programGazdaInput.click();
        programGazdaInput.clear();
        programGazdaInput.sendKeys(x);
        sleep(1000);
        programGazdaInput.sendKeys(Keys.ENTER);
    }

    public static void programNyilvantartasiSzam(String x) {
        WebElement programNyilvantartasiSzam = driver.findElement(By.xpath("//input[@id='filter_programNyilvszam']"));
        programNyilvantartasiSzam.click();
        programNyilvantartasiSzam.clear();
        programNyilvantartasiSzam.sendKeys(x);
    }

    public static void oraszam(String x) {
        driver.findElement(By.xpath("//span[@id='select2-filter_selectedOra-container']")).click();
        WebElement oraszamInput = driver.findElement(By.xpath("//input[@autocapitalize='off']"));
        oraszamInput.click();
        oraszamInput.clear();
        oraszamInput.sendKeys(x);
        oraszamInput.sendKeys(Keys.ENTER);
        //8 = 1-8 óra
        //9 = 9-16 óra
        //17 = 17-32 óra
        //33 = 33-64 óra
        //65 = 65- óra
    }

    public static void tanulmenyiPontszam(String x) {
        driver.findElement(By.xpath("//span[@id='select2-filter_selectedKredit-container']")).click();
        WebElement tanulmenyiPontszamInput = driver.findElement(By.xpath("//input[@autocapitalize='off']"));
        tanulmenyiPontszamInput.click();
        tanulmenyiPontszamInput.clear();
        tanulmenyiPontszamInput.sendKeys(x);
        tanulmenyiPontszamInput.sendKeys(Keys.ENTER);
        //8 = 1-8 tanulmányi pont
        //9 = 9-16 tanulmányi pont
        //17 = 17-32 tanulmányi pont
        //33 = 33-64 tanulmányi pont
        //65 = 65- tanulmányi pont
    }

    public static void koltseg(String x) {
        driver.findElement(By.xpath("//span[@id='select2-filter_selectedKoltseg-container']")).click();
        WebElement koltsegInput = driver.findElement(By.xpath("//input[@autocapitalize='off']"));
        koltsegInput.click();
        koltsegInput.clear();
        koltsegInput.sendKeys(x);
        koltsegInput.sendKeys(Keys.ENTER);
        //norm = normatíva terhére
        //nem = nem ismert
        //terit = térítéses
    }

    public static void programCsoport(String x) {
        driver.findElement(By.xpath("//span[@id='select2-filter_selectedPrgcsop-container']")).click();
        WebElement programCsoportInput = driver.findElement(By.xpath("//input[@autocapitalize='off']"));
        programCsoportInput.click();
        programCsoportInput.clear();
        programCsoportInput.sendKeys(x);
        programCsoportInput.sendKeys(Keys.ENTER);
        //bel = belső
        //k = közszolgálati
    }

    public static void szervezetreKorlatozott(String x) {
        driver.findElement(By.xpath("//span[@id='select2-filter_selectedSzervezetreKorlatozott-container']")).click();
        WebElement szervezetreKorlatozottInput = driver.findElement(By.xpath("//input[@autocapitalize='off']"));
        szervezetreKorlatozottInput.click();
        szervezetreKorlatozottInput.clear();
        szervezetreKorlatozottInput.sendKeys(x);
        szervezetreKorlatozottInput.sendKeys(Keys.ENTER);
        //igen = igen
        //nem = nem
    }

    public static void ELearning(boolean x) {
        if (x) {
            driver.findElement(By.xpath("//label[@id='btnSecondaryElearning']")).click();
        }
    }

    public static void jelenleti(boolean x) {
        if (x) {
            driver.findElement(By.xpath("//label[@id='btnSecondaryJelenleti']")).click();
        }
    }

    public static void blended(boolean x) {
        if (x) {
            driver.findElement(By.xpath("//label[@id='btnSecondaryBlended']")).click();
        }
    }

    public static void telepules(String x) {
        driver.findElement(By.xpath("//span[@id='select2-filter_telepulesId-container']")).click();
        WebElement telepulesInput = driver.findElement(By.xpath("//input[@autocapitalize='off']"));
        telepulesInput.click();
        telepulesInput.clear();
        telepulesInput.sendKeys(x);
        telepulesInput.sendKeys(Keys.ENTER);
        //buda = budapest
        //deb = debrecen
        //szeg = szeged
    }

    public static void hatalyossagKezdete(String x) {
        WebElement hatalyossagKezdete = driver.findElement(By.xpath("//p-calendar[@id='filter_hatKezd']/span/input"));
        hatalyossagKezdete.click();
        hatalyossagKezdete.clear();
        hatalyossagKezdete.sendKeys(x);
        hatalyossagKezdete.sendKeys(Keys.ENTER);
    }

    public static void targyevbenIndul(boolean x) {
        if (x) {
            driver.findElement(By.xpath("//p-checkbox[@id='filter_targyevbenIndul']/div/div[2]")).click();
        }
    }
}
