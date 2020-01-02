package com.premiumfaber.schoolapp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/schoolapp/",
        plugin = {"pretty"},
        extraGlue = "io.tpd.springbootcucumber.bagcommons"
)
public class RunCucumberTest{
}
