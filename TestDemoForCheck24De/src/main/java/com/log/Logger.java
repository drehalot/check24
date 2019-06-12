package com.log;

import org.testng.asserts.SoftAssert;

public class Logger {

    private StringBuilder stringBuilder = new StringBuilder();

    private SoftAssert softAssert = new SoftAssert();

    public void showInfo(String msg) {
        String message = "[INFO ]: " + msg;
        System.out.println(message);
        stringBuilder.append(message);
    }

    public void showError(String msg) {
        String message = "[FAIL ]: " + msg;
        System.err.println(message);
        stringBuilder.append(message);

        softAssert.fail(msg);
        softAssert.assertAll();
    }

    public void showPassed(String msg) {
        String message = "[PASS ]: " + msg;
        System.out.println(message);
        stringBuilder.append(message);
    }

    public SoftAssert getResultOfSoftAssert() {
        return softAssert;
    }

}
