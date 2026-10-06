package com.hospital.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class SchedulePage extends BasePage {

    // ⚠️ UPDATE: XPath of a single day cell in the calendar (we build the full path in code)
    private final By dayCellBase = By.xpath("//tbody/tr[1]/td[1]/div[1]");

    // ⚠️ UPDATE: CSS/XPath of available time slots
    private final By availableSlots = By.xpath("//div[normalize-space()='10:00 am']");

    public SchedulePage(WebDriver driver) {
        super(driver);
    }

    /** Clicks tomorrow's date on the calendar. */
    public void selectTomorrowDate() {
        String tomorrow = LocalDate.now().plusDays(1)
                .format(DateTimeFormatter.ofPattern("d").withLocale(Locale.ENGLISH));

        List<WebElement> days = driver.findElements(dayCellBase);
        for (WebElement day : days) {
            if (day.getText().trim().equals(tomorrow)) {
                day.click();
                return;
            }
        }
        throw new NoSuchElementException(
            "Tomorrow (" + tomorrow + ") not found/clickable in the calendar. " +
            "Found days: " + days.stream().map(d -> d.getText().trim()).toList());
    }

    /** Clicks the first available time slot and returns its time text. */
    public String pickFirstAvailableSlot() {
        List<WebElement> slots = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(availableSlots));
        WebElement slot = slots.get(0);
        String time = slot.getText().trim();
        slot.click();
        return time;
    }
}