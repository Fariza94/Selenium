package com.orangeHRM.test;

import base.CommonAPI;
import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.LoginPage;
import com.orangeHRM.pages.AdminPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestMenuAdminNationality extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestMenuAdminNationality.class.getName());
//    @Test
    public void addNationalityTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        AdminPage nationalityPage = new AdminPage(getDriver());
        String userName = ConnectDB.getTableColumnData("select * from credentials", "username").get(1);
        String password = ConnectDB.getTableColumnData("select * from credentials", "password").get(1);
        loginPage.login(userName, password);

        nationalityPage.addNationality("Algerian3");


    }
//    @Test
    public void TestVisibilityDeleteSelectedButton() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        AdminPage nationalityPage=new AdminPage(getDriver());
        String userName = ConnectDB.getTableColumnData("select * from credentials", "username").get(1);
        String password = ConnectDB.getTableColumnData("select * from credentials", "password").get(1);
        loginPage.login(userName, password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully landed in the homepage ");
        nationalityPage.checkTheVisibilityOfDeleteSelectedButton();

    }
//    @Test
    public void TestCancelAddingNationality() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        AdminPage nationalityPage=new AdminPage(getDriver());
        String userName = ConnectDB.getTableColumnData("select * from credentials", "username").get(1);
        String password = ConnectDB.getTableColumnData("select * from credentials", "password").get(1);
        loginPage.login(userName, password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully landed in the homepage ");
        nationalityPage.cancelAddingNationality("algerian");

    }
//    @Test
    public void TestDeleteNationalityUsingTrashLogo() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        AdminPage nationalityPage=new AdminPage(getDriver());
        String userName = ConnectDB.getTableColumnData("select * from credentials", "username").get(1);
        String password = ConnectDB.getTableColumnData("select * from credentials", "password").get(1);
        loginPage.login(userName, password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully landed in the homepage ");
        nationalityPage.deleteNationalityUsingTrashLogo();

    }
//    @Test
    public void TestDeleteNationalityUsingUsingDeleteSelectedButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        AdminPage nationalityPage=new AdminPage(getDriver());
        String userName = ConnectDB.getTableColumnData("select * from credentials", "username").get(1);
        String password = ConnectDB.getTableColumnData("select * from credentials", "password").get(1);
        loginPage.login(userName, password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully landed in the homepage ");
        nationalityPage.deleteNationalityUsingDeleteSelectedButton();

    }
//    @Test
    public void TestDeleteMultipleNationalities3UsingUsingDeleteSelectedButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        AdminPage nationalityPage=new AdminPage(getDriver());
        String userName = ConnectDB.getTableColumnData("select * from credentials", "username").get(1);
        String password = ConnectDB.getTableColumnData("select * from credentials", "password").get(1);
        loginPage.login(userName, password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully landed in the homepage ");
        nationalityPage.deleteMultipleNationalitiesUsingDeleteSelectedButton();

    }

//    @Test
    public void TestDeleteAllNationalitiesUsingDeleteSelectedButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        AdminPage nationalityPage=new AdminPage(getDriver());
        String userName = ConnectDB.getTableColumnData("select * from credentials", "username").get(1);
        String password = ConnectDB.getTableColumnData("select * from credentials", "password").get(1);
        loginPage.login(userName, password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully landed in the homepage ");
        nationalityPage.deleteAllNationalitiesUsingDeleteSelectedButton();

    }
    @Test
    public void TestEditeNationality() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        AdminPage nationalityPage=new AdminPage(getDriver());
        String userName = ConnectDB.getTableColumnData("select * from credentials", "username").get(1);
        String password = ConnectDB.getTableColumnData("select * from credentials", "password").get(1);
        loginPage.login(userName, password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully landed in the homepage ");
        nationalityPage.editeANationalityInTheRowFive(getDriver(),"'French'");

    }


}