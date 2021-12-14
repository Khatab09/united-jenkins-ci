package com.united.base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src//test//resources//features"},
        glue = {"com/united"},
        tags = "@test1" ,
        publish = true
//@test sanity
//@test1




)
public class RunnerTests extends AbstractTestNGCucumberTests {
}


