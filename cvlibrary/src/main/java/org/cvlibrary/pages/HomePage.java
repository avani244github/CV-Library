package org.cvlibrary.pages;


import org.cvlibrary.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By jobTitles = By.id("keywords");
    By locations = By.id("location");
    By distancesDropDown = By.xpath("//div[@class='hps-distance hps-transition']/select");
    By moreSearchOptionsLink = By.xpath("//button[@id='toggle-hp-search']");
    By salaryMinimum = By.xpath("//div[@class='hps-sal-min']/input");
    By salaryMaximum = By.id("salarymax");
    By salaryTypesDropDown = By.id("salarytype");
    By jobTypesDropDown = By.id("tempperm");
    By findJobButton = By.id("hp-search-btn");

    public void enterJobTitle(String jobtitles) {
        sendTextToElement(jobTitles, jobtitles);
    }
    public void enterLocation(String location) {
        sendTextToElement(locations, location);
    }
    public void enterDistanceDropdown(String distanceDropDown) {
        sendTextToElement(distancesDropDown, distanceDropDown);
    }
    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreSearchOptionsLink);
    }
    public void enterMinimumSalary(String salaryMin) {
        sendTextToElement(salaryMinimum, salaryMin);
    }
    public void enterMaximumSalary(String salaryMax) {
        sendTextToElement(salaryMaximum, salaryMax);
    }
    public void selectSalaryTypeDropdown(String salaryTypeDropdown) {
        selectByVisibleTextFromDropDown(salaryTypesDropDown, salaryTypeDropdown);
    }
    public void enterJobTypeFromDropDown(String jobTypeDropDown) {
        selectByVisibleTextFromDropDown(jobTypesDropDown, jobTypeDropDown);
    }
    public void clickOnFindJobs(){
        mouseHoverToElementAndClick(findJobButton);
    }
    public void acceptingCookies(){
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(By.xpath("//div[@class='action-buttons top-bottom right-column ng-star-inserted']/button[2]"));
        driver.switchTo().defaultContent();
    }


}







