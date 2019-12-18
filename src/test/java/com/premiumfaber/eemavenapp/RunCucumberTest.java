package com.premiumfaber.eemavenapp;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/com.premiumfaber.eemavenapp/",
        plugin = {"pretty"})
public class RunCucumberTest{
}