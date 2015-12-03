/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xwiki.application.webide.test.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.xwiki.test.ui.po.ViewPage;

/**
 *
 * @author Yann
 */
public class ProjectPage extends ViewPage {
    
    @FindBy(id = "openCreationBlock")
    private WebElement addNewProjectButton;

    
    public void addFolder(String folderName)
    {
        
    }
    
    public void addPage(String pageName)
    {
        
    }
    
    public void addClass(String className)
    {
        
    }
    
    public void addGlobal(String className)
    {
        
    }
    
    public void switchView(String newView)
    {
        
    }
    private void clickPlus(WebElement element)
    {
        
    }
    
}
