package com.google.testcases;

import com.google.pageobjects.GoogleSearchPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_Search_001 extends BaseClass {
    @Test
    public void searchGoogle() throws IOException {
        driver.get(baseURL);
        logger.info("URL is opened");
        GoogleSearchPage lp = new GoogleSearchPage(driver);
        //Thread.sleep(6000);
        WebElement outerframe=driver.findElement(By.xpath("//*[@id=\"cnsw\"]/iframe"));
        driver.switchTo().frame(outerframe);//swicth to outer frame

        lp.selectAgreementButtton();
 //       lp.InputWordSearch("marta");
//        lp.selectSubmit();
        if (driver.getTitle().equals("Google")) {
            //lp.clickLogout();
            Assert.assertTrue(true);
            logger.info("SearchGoogle Passed");//logger msg

        } else {
            captureScreen(driver,"searchGoogle");
            logger.info("Login Failed");//logger msg
            Assert.assertTrue(false);
        }
    }
}
