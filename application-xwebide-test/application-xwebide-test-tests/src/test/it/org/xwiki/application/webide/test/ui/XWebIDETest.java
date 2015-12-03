/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xwiki.application.webide.test.ui;

import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.xwiki.test.ui.AbstractTest;
import org.xwiki.test.ui.SuperAdminAuthenticationRule;


/**
 *
 * @author Yann
 */
public class XWebIDETest extends AbstractTest {
   
    // Login as superadmin to have delete rights.
    @Rule
    public SuperAdminAuthenticationRule authenticationRule = new SuperAdminAuthenticationRule(getUtil());
    
    @Test
    public void TestXWebIDE() throws Exception {
        String projectSpace = "WebIDE";
        String projectName = "TestProject";
        String projectCode = "TestProjectCode";
        String className = "MyTest";
        String itemPage = "Item1";
        String contentPage = "ContentPage";
        
        getUtil().gotoPage("Main", "WebHome");
        
        // Delete pages that we create in the test
        getUtil().deletePage(projectSpace, projectName);
        getUtil().deleteSpace(projectName);
        getUtil().deleteSpace(projectCode);
        //getDriver().findElement(By.cssSelector("#mainContentArea > div.centered.panel.panel-default.xwikimessage > div.panel-body > form > div:nth-child(2) > input")).click();

        getUtil().gotoPage("WebIDE", "WebHome");        
        
        Actions action = new Actions(getDriver());
        WebElement we = getDriver().findElement(By.cssSelector("#hierarchyMainList > li:nth-child(2) > div.hierarchy-toggleCategory"));
        action.moveToElement(we).perform();
        getDriver().findElement(By.cssSelector("#hierarchyMainList > li:nth-child(2) > div.btn-group.hierarchyAddNewElement > span")).click();
        getDriver().findElement(By.cssSelector("#hierarchyMainList > li:nth-child(2) > div.btn-group.hierarchyAddNewElement > ul > li:nth-child(1) > a")).click();
        getDriver().findElement(By.id("hierarchyNewFolderName")).sendKeys(projectName);
        getDriver().findElement(By.id("hierarchyAddFolder")).click();
    }    
}