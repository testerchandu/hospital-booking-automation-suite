package com.hospital.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BookAppointmentTest extends BaseTest {

    @Test(description = "Book appointment: English > Chakri Hospital > General Surgery > Chakri Doctor > Tomorrow")
    public void testBookAppointment() {

        // 1. Choose English language
        landingPage.chooseEnglish();

        // 2. Select Chakri Multi Speciality Hospital
        hospitalPage.selectChakriHospital();

        // 3. Click the General Surgery icon
        hospitalPage.clickGeneralSurgery();

        // 4. Select Chakri doctor
        doctorPage.selectChakriDoctor();

        // 5. Select tomorrow's date on the calendar
        schedulePage.selectTomorrowDate();

        // 6. Select the first available time slot
        String selectedTime = schedulePage.pickFirstAvailableSlot();

        // 7. Verify the confirmation summary
        String summary = confirmationPage.getSummaryText();

        SoftAssert softly = new SoftAssert();
        softly.assertTrue(summary.contains("Chakri Multi Speciality Hospital"),
                "Hospital missing. Summary:\n" + summary);
        softly.assertTrue(summary.toLowerCase().contains("chakri"),
                "Doctor missing. Summary:\n" + summary);
        softly.assertTrue(summary.contains(selectedTime),
                "Time '" + selectedTime + "' missing. Summary:\n" + summary);
        softly.assertAll();
    }
}