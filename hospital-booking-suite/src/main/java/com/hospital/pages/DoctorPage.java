package com.hospital.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DoctorPage extends BasePage {

    // ⚠️ UPDATE: XPath of the Chakri doctor card/option
    private final By chakriDoctor = By.xpath("//*[contains(.,'Chakri')]");

    public DoctorPage(WebDriver driver) {
        super(driver);
    }

    public void selectChakriDoctor() {
        click(chakriDoctor);
    }
}