package org.cvlibrary.pages;


import org.cvlibrary.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");


  public String getWelcomeText(){
      return getTextFromElement(welcomeText);
  }
}
