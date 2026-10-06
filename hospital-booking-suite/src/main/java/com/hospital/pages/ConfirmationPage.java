package com.hospital.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage extends BasePage {

    // ⚠️ UPDATE: XPath of the whole summary block (safest for contains-checks)
   private final By summaryBlock = By.xpath("//div[contains(@class,'summary')]");

    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public String getSummaryText() {
        return getText(summaryBlock);
    }
}