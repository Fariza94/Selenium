package com.saucedemo.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.pages.AboutPages;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.HomePageF;
import utility.ConnectDB;

public class ResetAppState extends CommonAPI {

    Logger LOG = LogManager.getLogger(ResetAppState.class.getName());
    //22
    @Test
    public void AboutTest() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        AboutPages aboutPages = new AboutPages(getDriver());
        String username = ConnectDB.getTableColumnData("select * from cred", "username").get(2);
        String password = ConnectDB.getTableColumnData("select * from cred", "password").get(2);
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePageF.typeusername(username);
        homePageF.typepassword(password);
        homePageF.clickOnLoginButon();

        cartPage.clickOnAddItem1();
        cartPage.clickOnAddTItem2();
        cartPage.clickOnAddItem3();
        cartPage.clickOnAdditem4();
        aboutPages.clickOnmenuButton();
        aboutPages.clickOnRestApp();
        aboutPages.clickOnCrossMenuButton();
        cartPage.clickOnShoppingCart();

    }
}
