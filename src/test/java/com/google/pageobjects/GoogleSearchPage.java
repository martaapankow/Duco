package com.google.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    private WebDriver driver;

    public GoogleSearchPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "q")
    WebElement txtSearch;

    @FindBy(xpath = "//input[@value='Szukaj w Google']")
    WebElement submitBtn;

    @FindBy(xpath = "//*[@id='introAgreeButton']/span/span")
    WebElement agreement;

    public void selectAgreementButtton(){
        agreement.click();
    }

    public void InputWordSearch(String searchWord){
        txtSearch.sendKeys(searchWord);
    }

//    public void selectSubmit(){
//        submitBtn.click();
//    }


}
