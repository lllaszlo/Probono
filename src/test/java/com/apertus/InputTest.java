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


        kompetenciak.click();
        driver.findElement(By.xpath("//div[@id='collapseOne']/div/div[3]/span/input")).click();
        sleep(5000);

        programNev.click();
        programNev.clear();
        programNev.sendKeys("asdfasdasd");

        programGazda.click();
        WebElement programGazdaInput = driver.findElement(By.xpath("//input[@role='textbox']"));
        programGazdaInput.click();
        programGazdaInput.clear();
        programGazdaInput.sendKeys("asdfasdasd");

    }

    @AfterClass
    public static void tearDownOnce() {
        driver.close();
    }
}
