package com.cocoin.core;

import io.appium.java_client.android.AndroidDriver;

public class Driverr extends TesstBase{
    protected AndroidDriver driver;
    public Driverr() {
        this.driver = super.getDriver();
    }
}