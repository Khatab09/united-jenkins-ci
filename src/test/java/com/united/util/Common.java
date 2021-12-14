package com.united.util;

import com.united.base.Hooks;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Common {


    private static Object JavascriptExecutor;

    public static void waitInSecond(int sec) {
        try {
            Thread.sleep(sec * 1000L);
        }
    catch (Exception I){
        }
    }

public  static void highlight_element(WebElement element){
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].setAttribute('style','background:white;border:4px solid red;');",element);
}

}
