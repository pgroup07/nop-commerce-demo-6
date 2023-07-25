package com.nopcommerce.demo;

import com.nopcommerce.demo.propertyreader.PropertyReader;
import com.nopcommerce.demo.utilities.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends Utility {

    @Before
    public void setup() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
