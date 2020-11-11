package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {
public WikipediaSearchPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}
    @FindBy(id="searchInput")
    public WebElement searchBox;

    @FindBy(className="sprite svg-search-icon")
    public WebElement searchButton;

    @FindBy(id="firstHeading")
    public WebElement mainHeader;

    @FindBy(xpath = "//div[@class='fn']")
    public WebElement imageHeader;
}
