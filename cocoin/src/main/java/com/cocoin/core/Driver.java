package com.cocoin.core;

import io.appium.java_client.android.AndroidDriver;

public class Driver extends TesstBase{
    protected AndroidDriver driver;
    public Driver() {
        this.driver = super.getDriver();
    }
}