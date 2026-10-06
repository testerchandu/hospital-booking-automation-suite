package com.hospital.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HospitalPage extends BasePage {

    // ⚠️ UPDATE: XPath of the "Chakri Multi Speciality Hospital" item/dropdown option
    private final By chakriHospital = By.xpath("//button[contains(text(),'Select')]");

    // ⚠️ UPDATE: XPath of the "General Surgery" icon/button
    private final By generalSurgeryIcon = By.xpath("//img");

    public HospitalPage(WebDriver driver) {
        super(driver);
    }

    public void selectChakriHospital() {
        click(chakriHospital);
    }

    public void clickGeneralSurgery() {
        click(generalSurgeryIcon);
    }
}