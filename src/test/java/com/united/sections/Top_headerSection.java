package com.united.sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Top_headerSection {
 @FindBy(css = "[class=\"app-containers-LocalizeButton-localizeButton__globeLanguage--3KA3o\"]")
    private WebElement globeLanguage_icon;
 @FindBy(id = "localization-language-selector")
 private WebElement selectLanguage_textField;
 @FindBy(xpath = "//*[@id=\"localization-content-wrapper\"]/div[2]/div[1]/div/div/ul/li")
 private List<WebElement> dropDown_language;
 @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[5]/header/div/div/div[1]/div/div/div/div[2]/nav/ul/li[1]/div")
 private WebElement homePage_language;

    public Top_headerSection() {
        PageFactory.initElements(driver,this);
    }

    public WebElement getGlobeLanguage_icon() {
        return globeLanguage_icon;
    }

    public WebElement getSelectLanguage_textField() {
        return selectLanguage_textField;
    }

    public List<WebElement> getDropDown_language() {
        return dropDown_language;
    }

    public WebElement getHomePage_language() {
        return homePage_language;
    }
}
