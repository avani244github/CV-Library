package org.cvlibrary.pages;

import org.cvlibrary.utility.Utility;
import org.openqa.selenium.By;

public class ResultPage extends Utility {
    By resultText = By.xpath("//main[@id='site-main']/div[1]/div[1]/div[2]/div[1]/div[1]/h1");
    public String verifyTheResults() {
        return getTextFromElement(resultText);

    }
}



