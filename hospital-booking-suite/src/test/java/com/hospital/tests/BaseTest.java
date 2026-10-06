package com.hospital.tests;

import com.hospital.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;
    protected LandingPage landingPage;
    protected HospitalPage hospitalPage;
    protected DoctorPage doctorPage;
    protected SchedulePage schedulePage;
    protected ConfirmationPage confirmationPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demohospital.revalomni.com/");

        landingPage       = new LandingPage(driver);
        hospitalPage      = new HospitalPage(driver);
        doctorPage        = new DoctorPage(driver);
        schedulePage      = new SchedulePage(driver);
        confirmationPage  = new ConfirmationPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}