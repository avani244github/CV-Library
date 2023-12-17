package org.cvlibrary.testsuite;

import org.cvlibrary.pages.HomePage;
import org.cvlibrary.pages.ResultPage;
import org.cvlibrary.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JobSearchTest extends TestBase {

    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();

    @Test(groups = {"First"})
    public void verifyTheResults() {
        homePage.acceptingCookies();
        homePage.enterJobTitle("Tester");
        homePage.enterLocation("Harrow");
        homePage.enterDistanceDropdown("up to 5 miles");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinimumSalary("30000");
        homePage.enterMaximumSalary("50000");
        homePage.selectSalaryTypeDropdown("Per annum");
        homePage.enterJobTypeFromDropDown("Permanent");
        homePage.clickOnFindJobs();

        String actualText = resultPage.verifyTheResults();
        // System.out.println(actualText);
        String expectedText = "Permanent Tester jobs in Harrow";
        Assert.assertEquals(actualText, expectedText);
    }
    @Test(groups = {"Second"})
    public void verifyTheResult() {
        homePage.acceptingCookies();
        homePage.enterJobTitle("Developer");
        homePage.enterLocation("Hanslow");
        homePage.enterDistanceDropdown("up to 10 miles");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinimumSalary("35000");
        homePage.enterMaximumSalary("55000");
        homePage.selectSalaryTypeDropdown("Per annum");
        homePage.enterJobTypeFromDropDown("Permanent");
        homePage.clickOnFindJobs();

        String actualText = resultPage.verifyTheResults();
        // System.out.println(actualText);
        String expectedText = "Permanent Developer jobs";
        Assert.assertEquals(actualText, expectedText);
    }
    @Test(groups = {"Third"})
    public void verifyTheResult2() {
        homePage.acceptingCookies();
        homePage.enterJobTitle("QA");
        homePage.enterLocation("Harrow");
        homePage.enterDistanceDropdown("up to 2 miles");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinimumSalary("50000");
        homePage.enterMaximumSalary("75000");
        homePage.selectSalaryTypeDropdown("Per annum");
        homePage.enterJobTypeFromDropDown("Permanent");
        homePage.clickOnFindJobs();

        String actualText = resultPage.verifyTheResults();
        // System.out.println(actualText);
         String expectedText = "Permanent Qa jobs in Harrow";
         Assert.assertEquals(actualText, expectedText);
    }
    @Test(groups = {"Fourth"})
    public void verifyTheResults3() {
        homePage.acceptingCookies();
        homePage.enterJobTitle("Tester");
        homePage.enterLocation("Southall");
        homePage.enterDistanceDropdown("up to 12 miles");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinimumSalary("35000");
        homePage.enterMaximumSalary("60000");
        homePage.selectSalaryTypeDropdown("Per annum");
        homePage.enterJobTypeFromDropDown("Permanent");
        homePage.clickOnFindJobs();

        String actualText = resultPage.verifyTheResults();
        // System.out.println(actualText);
        String expectedText = "Permanent Tester jobs in Southall";
        Assert.assertEquals(actualText, expectedText);
    }






}



