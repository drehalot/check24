package com;

import com.driver.GlobalDriver;
import com.page.object.NameOfScreens;
import com.page.object.main.MainScreen;
import com.page.object.reg.RegistrationForm;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class TestForHotelCheck {
    private GlobalDriver globalDriver;

    @BeforeTest
    public void setUp() {
        globalDriver = new GlobalDriver();
    }

    @Test
    @Parameters({"city"})
    public void testForCreateRandomAccountAndSearchHotelInLocation(String city) {
        String user = new RandomString().nextString() + "@gmail.com";
        String password = new RandomString(10).nextString();

        RegistrationForm registrationForm = new MainScreen(globalDriver.getDriverUtils(), "https://www.check24.de/").
                redirectToRegistrationForm();
        Assert.assertTrue(registrationForm != null && globalDriver.getDriverUtils().getTitle().contains(NameOfScreens.TITLE_REGISTRATION_FORM));

        List<WebElement> resultOfSearch = registrationForm.setUserName(user).setFirstPassword(password)
                .setSecondPassword(password).pressButtonRegistration().searchHotelByName(city).getResultOfSearch();

        Assert.assertTrue(registrationForm != null && globalDriver.getDriverUtils().getTitle().contains(NameOfScreens.TITLE_SEARCH_RESULT));
        Assert.assertTrue(resultOfSearch.size() > 0);

    }

    @AfterTest
    public void tearDow(){
        globalDriver.closeDriver();
    }
}
