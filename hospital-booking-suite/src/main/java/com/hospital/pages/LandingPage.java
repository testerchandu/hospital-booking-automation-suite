package com.hospital.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage {

    // ⚠️ UPDATE: XPath of the "English" language option on the welcome screen
    private final By englishLanguage = By.xpath("//div[@class='container py-4']//div[1]//div[1]//div[1]");

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void chooseEnglish() {
        click(englishLanguage);
    }
}